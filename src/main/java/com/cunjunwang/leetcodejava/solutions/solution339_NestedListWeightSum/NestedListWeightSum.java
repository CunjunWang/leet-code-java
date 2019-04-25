package com.cunjunwang.leetcodejava.solutions.solution339_NestedListWeightSum;

import com.cunjunwang.leetcodejava.solutions.CommonObject.NestedInteger;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by CunjunWang on 2019-04-25.
 */
@Component
public class NestedListWeightSum {

    private int sum = 0;

    /**
     * Given a nested list of integers, return the sum of all integers in the list weighted by their depth.
     * <p>
     * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
     * <p>
     * Example 1:
     * <p>
     * Input: [[1,1],2,[1,1]]
     * Output: 10
     * Explanation: Four 1's at depth 2, one 2 at depth 1.
     * <p>
     * Example 2:
     * <p>
     * Input: [1,[4,[6]]]
     * Output: 27
     * Explanation: One 1 at depth 1, one 4 at depth 2, and one 6 at depth 3; 1 + 4*2 + 6*3 = 27.
     *
     * @param nestedList
     * @return
     */
    public int depthSum(List<NestedInteger> nestedList) {
        return helper(nestedList, 1);
    }

    private int helper(List<NestedInteger> nestedList, int i) {
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                sum = sum + i * nestedInteger.getInteger();
            } else {
                List<NestedInteger> list = nestedInteger.getList();
                helper(list, i + 1);
            }
        }
        return sum;
    }

}
