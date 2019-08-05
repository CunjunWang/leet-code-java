package com.cunjunwang.leetcodejava.solutions.solution062_UniquePaths;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-05.
 */
@Component
public class UniquePaths {

    /**
     * A robot is located at the top-left corner of a m x n grid
     * The robot can only move either down or right at any point in time.
     * The robot is trying to reach the bottom-right corner of the grid
     * (marked 'Finish' in the diagram below).
     * How many possible unique paths are there?
     * <p>
     * Note: m and n will be at most 100.
     * <p>
     * Example 1:
     * Input: m = 3, n = 2
     * Output: 3
     * Explanation:
     * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
     * 1. Right -> Right -> Down
     * 2. Right -> Down -> Right
     * 3. Down -> Right -> Right
     * <p>
     * Example 2:
     * Input: m = 7, n = 3
     * Output: 28
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }
        return helper(m, n, memo);
    }

    private int helper(int m, int n, int[][] memo) {
        if (m - 1 == 0) {
            return 1;
        }
        if (n - 1 == 0) {
            return 1;
        }
        if (memo[m - 1][n - 1] != -1) {
            return memo[m - 1][n - 1];
        }
        memo[m - 1][n - 1] = helper(m - 1, n, memo) + helper(m, n - 1, memo);
        return memo[m - 1][n - 1];
    }
}
