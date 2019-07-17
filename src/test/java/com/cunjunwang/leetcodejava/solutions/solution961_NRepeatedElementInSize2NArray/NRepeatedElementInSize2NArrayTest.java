package com.cunjunwang.leetcodejava.solutions.solution961_NRepeatedElementInSize2NArray;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-17.
 */
public class NRepeatedElementInSize2NArrayTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(NRepeatedElementInSize2NArrayTest.class);

    @Autowired
    private NRepeatedElementInSize2NArray nRepeatedElementInSize2NArray;

    @Test
    public void repeatedNTimes() {
        int[] A = new int[]{5, 1, 5, 2, 5, 3, 5, 4};
        int i = nRepeatedElementInSize2NArray.repeatedNTimes(A);
        logger.info("result = {}", i);
    }
}