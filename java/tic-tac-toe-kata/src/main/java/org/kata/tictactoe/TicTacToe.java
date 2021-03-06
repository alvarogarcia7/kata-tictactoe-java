package org.kata.tictactoe;

public class TicTacToe {

    private final String player1;
    private final String player2;
    private String[][] board;
    private boolean isPlayer1 = true;

    public TicTacToe(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new String[][] { { "", "", "" }, { "", "", "" }, { "", "", "" } };
    }

    public void play(int i, int j) {
        this.board[i][j] = this.isPlayer1 ? this.player1 : this.player2;
        this.isPlayer1 = !this.isPlayer1;
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

    public String get(int i, int j) {
        return this.board[i][j];
    }
}
