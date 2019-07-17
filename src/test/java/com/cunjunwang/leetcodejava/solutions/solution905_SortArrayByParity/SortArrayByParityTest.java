package com.cunjunwang.leetcodejava.solutions.solution905_SortArrayByParity;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-17.
 */
public class SortArrayByParityTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(SortArrayByParityTest.class);

    @Autowired
    private SortArrayByParity sortArrayByParity;


    @Test
    public void sortArrayByParity() {
        int[] A = new int[]{3, 1, 2, 4};
        int[] ints = sortArrayByParity.sortArrayByParity(A);
        logger.info("result = {}", ints);
    }
}