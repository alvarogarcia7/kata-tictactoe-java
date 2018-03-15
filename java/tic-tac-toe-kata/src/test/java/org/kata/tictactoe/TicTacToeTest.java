package org.kata.tictactoe;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TicTacToeTest {
    @Test
    public void the_board_is_empty() {
        String[][] board = new String[0][0];

        assertThat(isEmpty(board)).isEqualTo(true);
    }

    private boolean isEmpty(String[][] board) {
        return false;
    }
}
