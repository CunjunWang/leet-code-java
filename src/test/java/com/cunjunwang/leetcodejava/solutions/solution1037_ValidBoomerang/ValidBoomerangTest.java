package com.cunjunwang.leetcodejava.solutions.solution1037_ValidBoomerang;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-06-30.
 */
public class ValidBoomerangTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(ValidBoomerangTest.class);

    @Autowired
    private ValidBoomerang validBoomerang;


    @Test
    public void isBoomerang() {
        int[][] points = new int[][]{new int[]{1,1}, new int[]{2,2}, new int[]{3,3}};
        boolean boomerang = validBoomerang.isBoomerang(points);
        logger.info("result: {}", boomerang);
    }
}