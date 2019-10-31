package com.cunjunwang.leetcodejava.solutions.solution0074_SearchA2DMatrix;

/**
 * Created by CunjunWang on 2019-10-31.
 */
public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        if (n == 0) return false;

        int low = 0, high = m * n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midR = mid / n;
            int midC = mid % n;
            if (matrix[midR][midC] == target) {
                return true;
            } else if (matrix[midR][midC] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

}
