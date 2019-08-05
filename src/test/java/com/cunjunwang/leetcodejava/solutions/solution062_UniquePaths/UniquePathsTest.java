package com.cunjunwang.leetcodejava.solutions.solution062_UniquePaths;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-08-05.
 */
public class UniquePathsTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(UniquePathsTest.class);

    @Autowired
    private UniquePaths uniquePaths;

    @Test
    public void uniquePaths() {
        int i = uniquePaths.uniquePaths(3, 2);
        logger.info("result = {}", i);
    }
}