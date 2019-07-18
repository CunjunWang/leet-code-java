package com.cunjunwang.leetcodejava.solutions.solution461_HammingDistance;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-18.
 */
public class HammingDistanceTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(HammingDistanceTest.class);

    @Autowired
    private HammingDistance hammingDistance;

    @Test
    public void hammingDistance() {
        int x = 1, y = 4;
        int i = hammingDistance.hammingDistance(x, y);
        logger.info("result = {}", i);
    }
}