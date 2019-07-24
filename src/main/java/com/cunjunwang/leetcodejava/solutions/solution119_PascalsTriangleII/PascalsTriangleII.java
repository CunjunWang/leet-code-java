package com.cunjunwang.leetcodejava.solutions.solution119_PascalsTriangleII;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-07-24.
 */
@Component
public class PascalsTriangleII {

    /**
     * Given a non-negative index k where k ≤ 33, return
     * the kth index row of the Pascal's triangle.
     * Note that the row index starts from 0.
     * In Pascal's triangle, each number is the sum of the two numbers directly above it.
     * <p>
     * Example:
     * Input: 3
     * Output: [1,3,3,1]
     * <p>
     * Follow up:
     * Could you optimize your algorithm to use only O(k) extra space?
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        result.add(one);
        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);
        result.add(two);
        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> prev = result.get(i - 1);
            for (int j = 0; j < prev.size() - 1; j++) {
                row.add(prev.get(j) + prev.get(j + 1));
            }
            row.add(1);
            result.add(row);
        }
        return result.get(rowIndex);
    }
}
