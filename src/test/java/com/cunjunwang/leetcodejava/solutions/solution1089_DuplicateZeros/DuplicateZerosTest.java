package com.cunjunwang.leetcodejava.solutions.solution1089_DuplicateZeros;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-08.
 */
public class DuplicateZerosTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private DuplicateZeros duplicateZeros;

    @Test
    public void duplicateZeros() {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros.duplicateZeros(arr);
        logger.info("result is {}", arr);
    }
}