package com.cunjunwang.leetcodejava.solutions.solution0228_SummaryRanges;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-10-02.
 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<>();
        if (nums.length == 0)
            return result;

        int start = nums[0], prev = start;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev + 1) {
                prev = prev + 1;
                continue;
            } else {
                if (start == prev) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + prev);
                }
                start = nums[i];
                prev = start;
            }
        }
        if (start == prev) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + prev);
        }

        return result;
    }

}
