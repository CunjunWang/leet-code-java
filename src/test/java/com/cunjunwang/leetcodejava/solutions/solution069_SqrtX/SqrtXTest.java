package com.cunjunwang.leetcodejava.solutions.solution069_SqrtX;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-19.
 */
public class SqrtXTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(SqrtXTest.class);

    @Autowired
    private SqrtX sqrtX;

    @Test
    public void mySqrt() {
        int i = 0;
        int result = sqrtX.mySqrt(i);
        logger.info("result of sqrt of {} is {}", i, result);

        i = 1;
        result = sqrtX.mySqrt(i);
        logger.info("result of sqrt of {} is {}", i, result);

        i = 4;
        result = sqrtX.mySqrt(i);
        logger.info("result of sqrt of {} is {}", i, result);

        i = 8;
        result = sqrtX.mySqrt(i);
        logger.info("result of sqrt of {} is {}", i, result);

        i = 15;
        result = sqrtX.mySqrt(i);
        logger.info("result of sqrt of {} is {}", i, result);

        i = 16;
        result = sqrtX.mySqrt(i);
        logger.info("result of sqrt of {} is {}", i, result);

        i = 100;
        result = sqrtX.mySqrt(i);
        logger.info("result of sqrt of {} is {}", i, result);
    }
}