package com.cunjunwang.leetcodejava.solutions.solution942_DIStringMatch;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-18.
 */
public class DIStringMatchTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(DIStringMatchTest.class);

    @Autowired
    private DIStringMatch diStringMatch;

    @Test
    public void diStringMatch() {
        String s = "IDID";
        int[] ints = diStringMatch.diStringMatch(s);
        logger.info("result = {}", ints);
    }
}