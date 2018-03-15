package org.kata.tictactoe;

public class TicTacToe {

    private String[][] board;
    boolean isX = true;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public void play(int i, int j) {
        this.board[i][j] = this.isX ? "X" : "O";
    }
}
