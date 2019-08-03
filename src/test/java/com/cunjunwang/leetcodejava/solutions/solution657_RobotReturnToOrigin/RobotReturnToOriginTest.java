package com.cunjunwang.leetcodejava.solutions.solution657_RobotReturnToOrigin;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-08-03.
 */
public class RobotReturnToOriginTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(RobotReturnToOriginTest.class);

    @Autowired
    private RobotReturnToOrigin robotReturnToOrigin;

    @Test
    public void judgeCircle() {
        String moves = "RLUURDDDLU";
        boolean b = robotReturnToOrigin.judgeCircle(moves);
        logger.info("result of {} is {}", moves, b);
    }
}