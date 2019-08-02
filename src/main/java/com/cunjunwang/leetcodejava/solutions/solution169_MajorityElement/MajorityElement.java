package com.cunjunwang.leetcodejava.solutions.solution169_MajorityElement;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-08-02.
 */
@Component
public class MajorityElement {

    /**
     * Given an array of size n, find the majority element.
     * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
     * You may assume that the array is non-empty and the majority
     * element always exist in the array.
     * <p>
     * Example 1:
     * Input: [3,2,3]
     * Output: 3
     * <p>
     * Example 2:
     * Input: [2,2,1,1,1,2,2]
     * Output: 2
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int majority = nums.length / 2;
        for (int num : nums) {
            if (map.get(num) != null) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > majority) {
                return key;
            }
        }
        return nums[0];
    }

}
