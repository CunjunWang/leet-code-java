package com.cunjunwang.leetcodejava.solutions.solution832_FlippingAnImage;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-17.
 */
public class FlippingAnImageTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(FlippingAnImageTest.class);

    @Autowired
    private FlippingAnImage flippingAnImage;

    @Test
    public void flipAndInvertImage() {
        int[][] A = new int[][]{new int[]{1, 1, 0}, new int[]{1, 0, 1}, new int[]{0, 0, 0}};
        int[][] B = flippingAnImage.flipAndInvertImage(A);
        for (int i = 0; i < B.length; i++) {
            logger.info("row {} data = {}", i + 1, B[i]);
        }
    }
}