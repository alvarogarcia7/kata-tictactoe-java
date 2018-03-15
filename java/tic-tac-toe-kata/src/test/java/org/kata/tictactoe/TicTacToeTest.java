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
        String[][] board = new String[3][3];

        set("X", board, 0, 0);
        set("X", board, 1, 0);
        set("X", board, 2, 0);

        assertThat(winning("X", board)).isEqualTo(true);
    }

    private boolean winning(String player, String[][] board) {

        return isEquals(player, board, 0, 0) && isEquals(player, board, 1, 0) && isEquals(player, board, 2, 0);
    }

    private boolean isEquals(String player, String[][] strings1, int i, int j) {
        return strings1[i][j].equals(player);
    }

    private void set(String x, String[][] board, int i, int j) {
        board[i][j] = x;
    }

    private boolean empty(String[][] board) {
        return true;
    }
}
