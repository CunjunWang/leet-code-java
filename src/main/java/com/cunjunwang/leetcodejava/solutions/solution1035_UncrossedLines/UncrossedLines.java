package com.cunjunwang.leetcodejava.solutions.solution1035_UncrossedLines;

/**
 * Created by CunjunWang on 2019-10-29.
 */
public class UncrossedLines {

    public int maxUncrossedLines(int[] A, int[] B) {
        // it is just the same as LCS problem
        // find the longest common subsequence
        int m = A.length;
        if (m == 0)
            return 0;
        int n = B.length;
        if (n == 0)
            return 0;

        int[][] dp = new int[m+1][n+1];

        dp[0][0] = A[0] == B[0] ? 1 : 0;
        for (int i = 1; i < m; i++) {
            if (A[i] == B[0] && dp[i-1][0] == 0) {
                dp[i][0] = 1 + dp[i-1][0];
            } else {
                dp[i][0] = dp[i-1][0];
            }
        }

        for (int j = 1; j < n; j++) {
            if (B[j] == A[0] && dp[0][j-1] == 0) {
                dp[0][j] = 1 + dp[0][j-1];
            } else {
                dp[0][j] = dp[0][j-1];
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (A[i] == B[j]) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m-1][n-1];
    }

}
