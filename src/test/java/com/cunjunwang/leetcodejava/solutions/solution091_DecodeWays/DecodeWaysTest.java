package com.cunjunwang.leetcodejava.solutions.solution091_DecodeWays;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-08-05.
 */
public class DecodeWaysTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(DecodeWaysTest.class);

    @Autowired
    private DecodeWays decodeWays;

    @Test
    public void numDecodings() {
        String s = "226";
        int numDecodings = decodeWays.numDecodings(s);
        logger.info("decoding ways for {} is {}", s, numDecodings);
    }
}