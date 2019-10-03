package com.cunjunwang.leetcodejava.solutions.solution0163_MissingRanges;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-10-02.
 */
public class MissingRangesTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private MissingRanges missingRanges;

    @Test
    public void findMissingRanges() {
        int[] nums = new int[]{0, 1, 3, 50, 75};
        int lower = 0, upper = 99;
        List<String> res = this.missingRanges.findMissingRanges(nums, lower, upper);
        logger.info("Res = {}", res);
    }
}