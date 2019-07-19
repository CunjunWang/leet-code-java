package com.cunjunwang.leetcodejava.solutions.solution066_PlusOne;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-19.
 */
public class PlusOneTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(PlusOneTest.class);

    @Autowired
    private PlusOne plusOne;

    @Test
    public void plusOne() {
        int[] digits = new int[]{1, 2, 3};
        int[] ints = plusOne.plusOne(digits);
        logger.info("result = {}", ints);
    }
}