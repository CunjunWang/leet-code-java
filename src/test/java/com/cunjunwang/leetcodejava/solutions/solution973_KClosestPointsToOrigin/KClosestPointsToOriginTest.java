package com.cunjunwang.leetcodejava.solutions.solution973_KClosestPointsToOrigin;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * Created by CunjunWang on 2019-02-22.
 */
public class KClosestPointsToOriginTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private KClosestPointsToOrigin kClosestPointsToOrigin;

    @Test
    public void kClosest() {
        logger.info("测试开始");

        int K1 = 1;
        int[][] points1 = {{1, 3}, {-2, 2}};
        int[][] result1 = kClosestPointsToOrigin.kClosest(points1, K1);
        logger.info("result1={}", result1);

        int K2 = 2;
        int[][] points2 = {{3, 3}, {5, -1}, {-2, 4}};
        int[][] result2 = kClosestPointsToOrigin.kClosest(points2, K2);
        logger.info("result2={}", result2);

        logger.info("测试完成");
    }

    @Test
    public void computeDistance() {
        logger.info("计算距离测试");
        int[] point1 = {1, 3};
        int[] point2 = {-2, 2};
        BigDecimal distance1 = kClosestPointsToOrigin.computeDistance(point1);
        BigDecimal distance2 = kClosestPointsToOrigin.computeDistance(point2);
        logger.info("测试完成, distance1={}, distance2={}", distance1, distance2);
    }
}