package com.cunjunwang.leetcodejava.solutions.solution0992_SubarraysWithKDifferentIntegers;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-10-18.
 */
public class SubarraysWithKDifferentIntegersTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private SubarraysWithKDifferentIntegers subarraysWithKDifferentIntegers;

    @Test
    public void subarraysWithKDistinct() {
//        int[] A = new int[]{1, 2, 1, 2, 3};
//        int K = 2;
//        int res = subarraysWithKDifferentIntegers.subarraysWithKDistinct(A, K);
//        logger.info("Result is: {}", res);

        int[] A = new int[]{1, 2, 1, 3, 4};
        int K = 3;
        int res = subarraysWithKDifferentIntegers.subarraysWithKDistinct(A, K);
        logger.info("Result is: {}", res);
    }
}