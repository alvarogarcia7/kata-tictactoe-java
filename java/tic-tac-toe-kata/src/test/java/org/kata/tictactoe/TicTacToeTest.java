package org.kata.tictactoe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TicTacToeTest {

    @Test
    public void is_empty() {

        String[][] board = new String[0][0];
        assertThat(empty(board)).isEqualTo(true);
    }

    private boolean empty(String[][] board) {
        return false;
    }
}
