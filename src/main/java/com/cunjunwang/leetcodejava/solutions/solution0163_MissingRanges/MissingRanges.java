package com.cunjunwang.leetcodejava.solutions.solution0163_MissingRanges;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-10-02.
 */
@Component
public class MissingRanges {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new LinkedList<>();
        if (nums.length == 0) {
            if (lower < upper) {
                result.add(lower + "->" + upper);
            } else if (lower == upper) {
                result.add(String.valueOf(lower));
            }
            return result;
        }
        if (lower == upper)
            return result;

        if (lower < nums[0]) {
            if (lower == nums[0] - 1) {
                result.add(String.valueOf(lower));
            } else {
                result.add(lower + "->" + (nums[0] - 1));
            }
        }
        int start = nums[0], prev = start;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev + 1) {
                prev++;
            } else if (nums[i] == prev) {

            } else {
                if (prev + 1 == nums[i] - 1)
                    result.add(String.valueOf(prev + 1));
                else
                    result.add((prev + 1) + "->" + (nums[i] - 1));

                start = nums[i];
                prev = start;
            }
        }
        if (upper > nums[nums.length - 1]) {
            if (upper == nums[nums.length - 1] + 1) {
                result.add(String.valueOf(upper));
            } else {
                result.add((nums[nums.length - 1] + 1) + "->" + upper);
            }
        }
        return result;
    }

}
