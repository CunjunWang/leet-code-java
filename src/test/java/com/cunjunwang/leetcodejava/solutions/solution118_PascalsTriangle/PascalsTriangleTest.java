package com.cunjunwang.leetcodejava.solutions.solution118_PascalsTriangle;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by CunjunWang on 2019-07-24.
 */
public class PascalsTriangleTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(PascalsTriangleTest.class);

    @Autowired
    private PascalsTriangle pascalsTriangle;

    @Test
    public void generate() {
        for (int i = 0; i < 10; i++) {
            List<List<Integer>> generate = pascalsTriangle.generate(i);
            logger.info("result for [{}] = {}", i, generate);
        }
    }
}