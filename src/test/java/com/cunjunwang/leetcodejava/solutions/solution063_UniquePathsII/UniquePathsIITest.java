package com.cunjunwang.leetcodejava.solutions.solution063_UniquePathsII;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-08-05.
 */
public class UniquePathsIITest extends LeetCodeJavaApplicationTests {

    @Autowired
    private UniquePathsII uniquePathsII;

    @Test
    public void uniquePathsWithObstacles() {
        int[][] obstacleGrid = new int[][]{new int[]{0, 0, 0}, new int[]{0, 1, 0}, new int[]{0, 0, 0}};
        int i = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);
        logger.info("result = {}", i);
    }

}