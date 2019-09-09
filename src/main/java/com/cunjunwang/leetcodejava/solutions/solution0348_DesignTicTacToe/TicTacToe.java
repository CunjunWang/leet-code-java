package com.cunjunwang.leetcodejava.solutions.solution0348_DesignTicTacToe;

/**
 * Created by CunjunWang on 2019-09-09.
 */
public class TicTacToe {

    private int[] R;

    private int[] C;

    int diag = 0, antiDiag = 0;

    int size = 0;

    /**
     * Initialize your data structure here.
     */
    public TicTacToe(int n) {
        R = new int[n];
        for (int i = 0; i < n; i++) {
            R[i] = 0;
        }
        C = new int[n];
        for (int i = 0; i < n; i++) {
            C[i] = 0;
        }
        this.size = n;
    }

    /**
     * Player {player} makes a move at ({row}, {col}).
     *
     * @param row    The row of the board.
     * @param col    The column of the board.
     * @param player The player, can be either 1 or 2.
     * @return The current winning condition, can be either:
     * 0: No one wins.
     * 1: Player 1 wins.
     * 2: Player 2 wins.
     */
    public int move(int row, int col, int player) {
        int add = player == 1 ? 1 : -1;

        R[row] += add;
        C[col] += add;

        if (row == col) {
            diag += add;
        }
        if (row + col == size - 1) {
            antiDiag += add;
        }

        if (Math.abs(R[row]) == size ||
                Math.abs(C[col]) == size ||
                Math.abs(diag) == size ||
                Math.abs(antiDiag) == size) {
            return player;
        }

        return 0;
    }

}
