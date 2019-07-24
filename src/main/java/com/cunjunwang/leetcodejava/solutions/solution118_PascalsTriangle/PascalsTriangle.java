package com.cunjunwang.leetcodejava.solutions.solution118_PascalsTriangle;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-07-24.
 */
@Component
public class PascalsTriangle {

    /**
     * Given a non-negative integer numRows, generate the first
     * numRows of Pascal's triangle.
     * In Pascal's triangle, each number is the sum of the two
     * numbers directly above it.
     * <p>
     * Example:
     * Input: 5
     * Output:
     * [
     * [1],
     * [1,1],
     * [1,2,1],
     * [1,3,3,1],
     * [1,4,6,4,1]
     * ]
     *
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> one = new ArrayList<>();
        one.add(1);
        result.add(one);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if (i != 2) {
                List<Integer> prev = result.get(i - 2);
                for (int j = 0; j < prev.size() - 1; j++) {
                    row.add(prev.get(j) + prev.get(j + 1));
                }
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
