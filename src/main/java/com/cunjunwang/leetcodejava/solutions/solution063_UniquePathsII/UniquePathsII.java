package com.cunjunwang.leetcodejava.solutions.solution063_UniquePathsII;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-05.
 */
@Component
public class UniquePathsII {

    /**
     * A robot is located at the top-left corner of a m x n grid
     * The robot can only move either down or right at any point in time.
     * The robot is trying to reach the bottom-right corner of the grid
     * Now consider if some obstacles are added to the grids. How many
     * unique paths would there be?
     * <p>
     * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
     * Note: m and n will be at most 100.
     * <p>
     * Example 1:
     * Input:
     * [
     * [0,0,0],
     * [0,1,0],
     * [0,0,0]
     * ]
     * Output: 2
     * Explanation:
     * There is one obstacle in the middle of the 3x3 grid above.
     * There are two ways to reach the bottom-right corner:
     * 1. Right -> Right -> Down -> Down
     * 2. Down -> Down -> Right -> Right
     *
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m == 0) return 0;
        int n = obstacleGrid[0].length;
        if (n == 0) return 0;

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        obstacleGrid[0][0] = 1;

        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i - 1][0] == 1 && obstacleGrid[i][0] == 0) {
                obstacleGrid[i][0] = 1;
            } else {
                obstacleGrid[i][0] = 0;
            }
        }

        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i - 1] == 1 && obstacleGrid[0][i] == 0) {
                obstacleGrid[0][i] = 1;
            } else {
                obstacleGrid[0][i] = 0;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                } else {
                    obstacleGrid[i][j] = 0;
                }
            }
        }

        return obstacleGrid[m-1][n-1];
    }


}
