package org.kata.tictactoe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TicTacToeTest {

    @Test
    public void sets_the_position() {
        String[][] board = new String[][] { { "", "", "" }, { "", "", "" }, { "", "", "" } };

        set("X", board, 0, 0);

        assertThat(board[0][0]).isEqualTo("X");
    }

    @Test
    public void win_in_first_column() {
        String[][] board = new String[][] { { "", "", "" }, { "", "", "" }, { "", "", "" } };

        set("X", board, 0, 0);
        set("X", board, 1, 0);
        set("X", board, 2, 0);

        assertThat(winning("X", board)).isEqualTo(true);
    }

    @Test
    public void win_in_second_column() {
        String[][] board = new String[][] { { "", "", "" }, { "", "", "" }, { "", "", "" } };

        set("X", board, 0, 1);
        set("X", board, 1, 1);
        set("X", board, 2, 1);

        assertThat(winning("X", board)).isEqualTo(true);
    }

    @Test
    public void win_in_third_column() {
        String[][] board = new String[][] { { "", "", "" }, { "", "", "" }, { "", "", "" } };

        set("X", board, 0, 2);
        set("X", board, 1, 2);
        set("X", board, 2, 2);

        assertThat(winning("X", board)).isEqualTo(true);
    }

    @Test
    public void win_in_first_row() {
        String[][] board = new String[][] { { "", "", "" }, { "", "", "" }, { "", "", "" } };

        set("X", board, 0, 0);
        set("X", board, 0, 1);
        set("X", board, 0, 2);

        assertThat(winning("X", board)).isEqualTo(true);
    }

    @Test
    public void win_in_second_row() {
        String[][] board = new String[][] { { "", "", "" }, { "", "", "" }, { "", "", "" } };

        set("X", board, 1, 0);
        set("X", board, 1, 1);
        set("X", board, 1, 2);

        assertThat(winning("X", board)).isEqualTo(true);
    }

    @Test
    public void win_in_third_row() {
        String[][] board = new String[][] { { "", "", "" }, { "", "", "" }, { "", "", "" } };

        set("X", board, 2, 0);
        set("X", board, 2, 1);
        set("X", board, 2, 2);

        assertThat(winning("X", board)).isEqualTo(true);
    }

    @Test
    public void win_in_main_diagonal() {
        String[][] board = new String[][] { { "", "", "" }, { "", "", "" }, { "", "", "" } };

        set("X", board, 0, 0);
        set("X", board, 1, 1);
        set("X", board, 2, 2);

        assertThat(winning("X", board)).isEqualTo(true);
    }

    @Test
    public void win_in_other_diagonal() {
        String[][] board = new String[][] { { "", "", "" }, { "", "", "" }, { "", "", "" } };

        set("X", board, 2, 0);
        set("X", board, 1, 1);
        set("X", board, 0, 2);

        assertThat(winning("X", board)).isEqualTo(true);
    }

    private void set(String x, String[][] board, int i, int j) {
        new TicTacToe(board).play(i, j);
    }

    private boolean winning(String p, String[][] b) {
        return p.equals(new TicTacToe(b).isWinning());

    }

}
