package com.cunjunwang.leetcodejava.solutions.solution167_TwoSumIIInputArrayIsSorted;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-04-19.
 */
@Component
public class TwoSumIIInputArrayIsSorted {

    /**
     * Given an array of integers that is already sorted in ascending order,
     * find two numbers such that they add up to a specific target number.
     * <p>
     * The function twoSum should return indices of the two numbers such that
     * they add up to the target, where index1 must be less than index2.
     * <p>
     * Note:
     * <p>
     * Your returned answers (both index1 and index2) are not zero-based.
     * You may assume that each input would have exactly one solution and you may not use the same element twice.
     * <p>
     * Example:
     * <p>
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (store.get(target - numbers[i]) != null) {
                return new int[]{store.get(target - numbers[i]) + 1, i + 1};
            }
            store.put(numbers[i], i);
        }
        return new int[]{0, 0};
    }

}
