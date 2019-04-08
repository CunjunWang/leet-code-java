package com.cunjunwang.leetcodejava.solutions.solution973_KClosestPointsToOrigin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by CunjunWang on 2019-02-21.
 */
@Component
public class KClosestPointsToOrigin {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    /**
     * We have a list of points on the plane. Find the K closest points to the origin (0, 0).
     * <p>
     * (Here, the distance between two points on a plane is the Euclidean distance.)
     * <p>
     * You may return the answer in any order. The answer is guaranteed to be unique
     * (except for the order that it is in.)
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: points = [[1,3],[-2,2]], K = 1
     * Output: [[-2,2]]
     * Explanation:
     * The distance between (1, 3) and the origin is sqrt(10).
     * The distance between (-2, 2) and the origin is sqrt(8).
     * Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
     * We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
     * <p>
     * <p>
     * Example 2:
     * <p>
     * Input: points = [[3,3],[5,-1],[-2,4]], K = 2
     * Output: [[3,3],[-2,4]]
     * (The answer [[-2,4],[3,3]] would also be accepted.)
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= K <= points.length <= 10000
     * -10000 < points[i][0] < 10000
     * -10000 < points[i][1] < 10000
     *
     * @param points
     * @param K
     * @return
     */
    public int[][] kClosest(int[][] points, int K) {
        if (points.length <= K) return points;
        Map<BigDecimal, int[]> resultMap = new TreeMap<>();
        for (int[] point : points) {
            BigDecimal distance = computeDistance(point);
            resultMap.put(distance, point);
        }
        logger.info("Result Map = {}", resultMap);
        int[][] result = new int[K][];
        while (K > 0) {
            result[K] = resultMap.entrySet().iterator().next().getValue();
            K--;
        }
        return result;
    }

    public BigDecimal computeDistance(int[] point) {
        int x = point[0];
        int y = point[1];
        return new BigDecimal(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
