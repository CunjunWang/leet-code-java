package com.cunjunwang.leetcodejava.solutions.solution788_RotatedDigits;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-08-03.
 */
public class RotatedDigitsTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(RotatedDigitsTest.class);

    @Autowired
    private RotatedDigits rotatedDigits;

    @Test
    public void rotatedDigits() {
        int N = 10;
        int i = rotatedDigits.rotatedDigits(N);
        logger.info("result = {}", i);
    }
}