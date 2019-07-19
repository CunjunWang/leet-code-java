package com.cunjunwang.leetcodejava.solutions.solution053_MaximumSubarray;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-19.
 */
public class MaximumSubarrayTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(MaximumSubarrayTest.class);

    @Autowired
    private MaximumSubarray maximumSubarray;

    @Test
    public void maxSubArrayDP() {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = maximumSubarray.maxSubArrayDP(arr);
        logger.info("result = {}", i);
    }
}