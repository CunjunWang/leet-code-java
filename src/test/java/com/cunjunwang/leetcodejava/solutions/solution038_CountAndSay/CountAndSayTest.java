package com.cunjunwang.leetcodejava.solutions.solution038_CountAndSay;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-19.
 */
public class CountAndSayTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(CountAndSayTest.class);

    @Autowired
    private CountAndSay countAndSay;

    @Test
    public void countAndSay() {
        for (int i = 1; i < 10; i++) {
            String s = countAndSay.countAndSay(i);
            logger.info(s);
        }
    }
}