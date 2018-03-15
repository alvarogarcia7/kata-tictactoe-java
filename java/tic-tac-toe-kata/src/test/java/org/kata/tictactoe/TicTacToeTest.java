package org.kata.tictactoe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TicTacToeTest {
    TicTacToe board = new TicTacToe("X", "O");

    @Test
    public void starts_with_player_x() {
        playX(0, 0);

        assertThat(get(0, 0)).isEqualTo("X");
    }

    @Test
    public void cannot_play_twice_as_the_same_player() {
        final int i = 0;
        final int j = 0;
        playX(i, j);
        this.board.play(0, 1);

        assertThat(get(0, 0)).isEqualTo("X");
        assertThat(get(0, 1)).isEqualTo("O");

    }

    @Test
    public void win_in_first_column() {
        playX(0, 0);
        playO();
        playX(1, 0);
        playO();
        playX(2, 0);

        assertWinner("X");
    }

    @Test
    public void win_in_second_column() {
        playX(0, 1);
        playO(0, 0);
        playX(1, 1);
        playO(0, 0);
        playX(2, 1);

        assertWinner("X");
    }

    @Test
    public void win_in_third_column() {
        playX(0, 2);
        playO();
        playX(1, 2);
        playO();
        playX(2, 2);

        assertWinner("X");
    }

    @Test
    public void win_in_first_row() {
        playX(0, 0);
        playO(2, 2);
        playX(0, 1);
        playO(2, 2);
        playX(0, 2);

        assertWinner("X");
    }

    @Test
    public void win_in_second_row() {
        playX(1, 0);
        playO();
        playX(1, 1);
        playO();
        playX(1, 2);

        assertWinner("X");
    }

    @Test
    public void win_in_third_row() {
        playX(2, 0);
        playO();
        playX(2, 1);
        playO();
        playX(2, 2);

        assertWinner("X");
    }

    @Test
    public void win_in_main_diagonal() {
        playX(0, 0);
        playO();
        playX(1, 1);
        playO();
        playX(2, 2);

        assertWinner("X");
    }

    @Test
    public void win_in_other_diagonal() {
        playX(2, 0);
        playO();
        playX(1, 1);
        playO();
        playX(0, 2);

        assertWinner("X");
    }

    private String get(int i, int j) {
        return this.board.get(i, j);
    }

    private void assertWinner(String x) {
        assertThat(this.board.winner()).isEqualTo(x);
    }

    private void playX(int i, int j) {
        this.board.play(i, j);
    }

    private void playO() {
        this.board.play(0, 1);
    }

    private void playO(int i, int j) {
        this.board.play(i, j);
    }
}
