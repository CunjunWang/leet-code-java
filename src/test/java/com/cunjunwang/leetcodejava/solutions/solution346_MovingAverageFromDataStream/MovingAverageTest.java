package com.cunjunwang.leetcodejava.solutions.solution346_MovingAverageFromDataStream;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by CunjunWang on 2019-04-25.
 */
public class MovingAverageTest {

    private static final Logger logger = LoggerFactory.getLogger(MovingAverageTest.class);

    @Test
    public void test() {
        MovingAverage movingAverage = new MovingAverage(3);
        logger.info("next: {}", movingAverage.next(1));
        logger.info("next: {}", movingAverage.next(10));
        logger.info("next: {}", movingAverage.next(3));
        logger.info("next: {}", movingAverage.next(5));
    }

}