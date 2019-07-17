package com.cunjunwang.leetcodejava.solutions.solution977_SquaresOfASortedArray;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-17.
 */
public class SquaresOfASortedArrayTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(SquaresOfASortedArrayTest.class);

    @Autowired
    private SquaresOfASortedArray squaresOfASortedArray;

    @Test
    public void sortedSquares() {
        int[] A = new int[]{-4,-1,0,3,10};
        A = squaresOfASortedArray.sortedSquares(A);
        logger.info("result = {}", A);
    }
}