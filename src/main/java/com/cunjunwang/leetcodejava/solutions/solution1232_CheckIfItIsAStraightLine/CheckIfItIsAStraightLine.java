package com.cunjunwang.leetcodejava.solutions.solution1232_CheckIfItIsAStraightLine;

/**
 * Created by CunjunWang on 2019-10-31.
 */
public class CheckIfItIsAStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2)
            return true;

        int[] point1 = coordinates[0];
        int[] point2 = coordinates[1];
        int x1 = point1[0], y1 = point1[1], x2 = point2[0], y2 = point2[1];
        double prev = slope(x1,y1,x2,y2);
        System.out.println("prev = " + prev);

        for (int i = 1; i < coordinates.length; i++) {
            int[] p1 = coordinates[i-1];
            int[] p2 = coordinates[i];
            x1 = p1[0];y1 = p1[1]; x2 = p2[0]; y2 = p2[1];
            double s = slope(x1,y1,x2,y2);
            System.out.println("s = " + s);
            if (s != prev) {
                return false;
            }
        }
        return true;
    }

    private double slope(int x1, int y1, int x2, int y2) {
        if (x2 == x1) {
            return (double) Integer.MAX_VALUE;
        }
        double diffy = y2 - y1;
        double diffx = x2 - x1;
        return diffy / diffx;
    }

}
