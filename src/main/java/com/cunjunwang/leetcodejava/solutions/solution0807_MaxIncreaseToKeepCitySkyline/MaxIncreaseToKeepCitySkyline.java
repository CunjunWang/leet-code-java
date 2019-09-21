package com.cunjunwang.leetcodejava.solutions.solution0807_MaxIncreaseToKeepCitySkyline;

/**
 * Created by CunjunWang on 2019-09-21.
 */
public class MaxIncreaseToKeepCitySkyline {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int res = 0;
        int N = grid.length;
        int[] rowMaxes = new int[N];
        int[] colMaxes = new int[N];

        for (int r = 0; r < N; ++r) {
            for (int c = 0; c < N; ++c) {
                rowMaxes[r] = Math.max(rowMaxes[r], grid[r][c]);
                colMaxes[c] = Math.max(colMaxes[c], grid[r][c]);
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                res += Math.min(rowMaxes[r], colMaxes[c]) - grid[r][c];
            }
        }

        return res;
    }

}
