package org.kata.tictactoe;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TicTacToeTest {
    TicTacToe board = new TicTacToe(new String[][] { { "", "", "" }, { "", "", "" }, { "", "", "" } });

    @Test
    public void starts_with_player_x() {
        this.board.play(0, 0);

        assertThat(get(0, 0)).isEqualTo("X");
    }

    @Ignore
    @Test
    public void cannot_play_twice_as_the_same_player() {
        this.board.play(0, 0);
        this.board.play(0, 1);

        assertThat(get(0, 0)).isEqualTo("X");
        assertThat(get(0, 1)).isEqualTo("O");

    }

    private String get(int i, int j) {
        return this.board.get(i, j);
    }

    @Test
    public void win_in_first_column() {
        this.board.play(0, 0);
        this.board.play(1, 0);
        this.board.play(2, 0);

        assertThat(winning("X", this.board)).isEqualTo(true);
    }

    @Test
    public void win_in_second_column() {
        this.board.play(0, 1);
        this.board.play(1, 1);
        this.board.play(2, 1);

        assertThat(winning("X", this.board)).isEqualTo(true);
    }

    @Test
    public void win_in_third_column() {
        this.board.play(0, 2);
        this.board.play(1, 2);
        this.board.play(2, 2);

        assertThat(winning("X", this.board)).isEqualTo(true);
    }

    @Test
    public void win_in_first_row() {
        this.board.play(0, 0);
        this.board.play(0, 1);
        this.board.play(0, 2);

        assertThat(winning("X", this.board)).isEqualTo(true);
    }

    @Test
    public void win_in_second_row() {
        this.board.play(1, 0);
        this.board.play(1, 1);
        this.board.play(1, 2);

        assertThat(winning("X", this.board)).isEqualTo(true);
    }

    @Test
    public void win_in_third_row() {
        this.board.play(2, 0);
        this.board.play(2, 1);
        this.board.play(2, 2);

        assertThat(winning("X", this.board)).isEqualTo(true);
    }

    @Test
    public void win_in_main_diagonal() {
        this.board.play(0, 0);
        this.board.play(1, 1);
        this.board.play(2, 2);

        assertThat(winning("X", this.board)).isEqualTo(true);
    }

    @Test
    public void win_in_other_diagonal() {
        this.board.play(2, 0);
        this.board.play(1, 1);
        this.board.play(0, 2);

        assertThat(winning("X", this.board)).isEqualTo(true);
    }

    private boolean winning(String p, TicTacToe b) {
        return p.equals(b.winner());

    }

}
