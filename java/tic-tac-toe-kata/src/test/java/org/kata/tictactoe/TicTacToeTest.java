package org.kata.tictactoe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TicTacToeTest {

    @Test
    public void is_empty() {
        String[][] board = new String[0][0];

        assertThat(empty(board)).isEqualTo(true);
    }

    @Test
    public void sets_the_position() {
        String[][] board = new String[1][1];

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

    private boolean winning(String p, String[][] b) {

        return inColumn(p, b, 0) || inColumn(p, b, 1) || inColumn(p, b, 2) || inRow(p, b, 0) || inRow(p, b, 1) || inRow(p, b, 2);
    }

    private boolean inColumn(String p, String[][] b, int i) {
        return eq(p, b, 0, i) && eq(p, b, 1, i) && eq(p, b, 2, i);
    }

    private boolean inRow(String p, String[][] b, int i) {
        return eq(p, b, i, 0) && eq(p, b, i, 1) && eq(p, b, i, 2);
    }

    private boolean eq(String player, String[][] strings1, int i, int j) {
        return strings1[i][j].equals(player);
    }

    private void set(String x, String[][] board, int i, int j) {
        board[i][j] = x;
    }

    private boolean empty(String[][] board) {
        return true;
    }
}
