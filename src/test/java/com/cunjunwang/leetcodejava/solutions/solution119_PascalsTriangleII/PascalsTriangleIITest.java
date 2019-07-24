package com.cunjunwang.leetcodejava.solutions.solution119_PascalsTriangleII;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by CunjunWang on 2019-07-24.
 */
public class PascalsTriangleIITest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(PascalsTriangleIITest.class);

    @Autowired
    private PascalsTriangleII pascalsTriangleII;

    @Test
    public void getRow() {
        for (int i = 0; i < 10; i++) {
            List<Integer> row = pascalsTriangleII.getRow(i);
            logger.info("row [{}] is {}", i, row);
        }
    }
}