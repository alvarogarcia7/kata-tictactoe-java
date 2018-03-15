package org.kata.tictactoe;

public class TicTacToe {

    private String[][] board;
    private boolean isX = true;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public void play(int i, int j) {
        this.board[i][j] = this.isX ? "X" : "O";
        this.isX = !this.isX;
    }

    public String winner() {
        return inColumn(0) + inColumn(1) + inColumn(2) + inRow(0) + inRow(1) + inRow(2) + inMainDiagonal() + inOtherDiagonal();
    }

    private String inMainDiagonal() {
        final String player = at(0, 0);
        if (player.equals(at(1, 1)) && player.equals(at(2, 2))) {
            return player;
        }
        return "";
    }

    private String inOtherDiagonal() {
        final String at = at(2, 0);
        if (at.equals(at(1, 1)) && at.equals(at(0, 2))) {
            return at;
        }
        return "";
    }

    private String inColumn(int i) {
        final String player = at(0, i);
        return player.equals(at(1, i)) && player.equals(at(2, i)) ? player : "";
    }

    private String inRow(int i) {
        final String player = at(i, 0);
        return player.equals(at(i, 1)) && player.equals(at(i, 2)) ? player : "";
    }

    private String at(int i, int j) {
        return this.board[i][j];
    }

    private void set(String x, String[][] board, int i, int j) {
        new TicTacToe(board).play(i, j);
    }

    public String get(int i, int j) {
        return this.board[i][j];
    }
}
