package com.cunjunwang.leetcodejava.solutions.solution485_MaxConsecutiveOnes;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-08-02.
 */
public class MaxConsecutiveOnesTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(MaxConsecutiveOnesTest.class);

    @Autowired
    private MaxConsecutiveOnes maxConsecutiveOnes;

    @Test
    public void findMaxConsecutiveOnes() {
        int[] nums = new int[]{1, 1};
        int maxConsecutiveOnes = this.maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        logger.info("max consecutive ones for {} is: {}", nums, maxConsecutiveOnes);
    }
}