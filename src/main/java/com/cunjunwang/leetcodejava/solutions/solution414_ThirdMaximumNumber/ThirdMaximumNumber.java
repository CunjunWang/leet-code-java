package com.cunjunwang.leetcodejava.solutions.solution414_ThirdMaximumNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-07-18.
 */
public class ThirdMaximumNumber {

    /**
     * Given a non-empty array of integers, return the third maximum
     * number in this array. If it does not exist, return the maximum
     * number. The time complexity must be in O(n).
     * <p>
     * Example 1:
     * Input: [3, 2, 1]
     * Output: 1
     * Explanation: The third maximum is 1.
     * <p>
     * Example 2:
     * Input: [1, 2]
     * Output: 2
     * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
     * <p>
     * Example 3:
     * Input: [2, 2, 3, 1]
     * Output: 1
     * Explanation: Note that the third maximum here means the third maximum distinct number.
     * Both numbers with value 2 are both considered as second maximum
     *
     * @param nums
     * @return
     */
    // TODO:
    public int thirdMax(int[] nums) {
        Map<Integer, Integer> collect = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (collect.get(i) == null) {
                collect.put(i, 1);
            } else {
                int count = collect.get(i);
                collect.put(i, ++count);
            }
        }

        int numberOfKey = collect.keySet().size();
        if (numberOfKey < 3) {

        }
        return 0;
    }
}
