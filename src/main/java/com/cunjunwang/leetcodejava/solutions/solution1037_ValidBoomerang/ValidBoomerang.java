package com.cunjunwang.leetcodejava.solutions.solution1037_ValidBoomerang;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-06-30.
 */
@Component
public class ValidBoomerang {

    /**
     * A boomerang is a set of 3 points that are all distinct and not in a straight line.
     * <p>
     * Given a list of three points in the plane, return whether these points are a boomerang.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: [[1,1],[2,3],[3,2]]
     * Output: true
     * <p>
     * Example 2:
     * <p>
     * Input: [[1,1],[2,2],[3,3]]
     * Output: false
     * <p>
     * <p>
     * Note:
     * <p>
     * points.length == 3
     * points[i].length == 2
     * 0 <= points[i][j] <= 100
     *
     * @param points
     * @return
     */
    public boolean isBoomerang(int[][] points) {
        int[] point1 = points[0];
        int[] point2 = points[1];
        int[] point3 = points[2];
        return slope(point1, point2) != slope(point2, point3);
    }

    private double slope(int[] point1, int[] point2) {
        if ((point2[0] - point1[0]) == 0) {
            return Integer.MAX_VALUE;
        } else {
            return (point2[1] - point1[1]) / (point2[0] - point1[0]);
        }
    }
}
