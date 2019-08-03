package com.cunjunwang.leetcodejava.solutions.solution917_ReverseOnlyLetters;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-08-03.
 */
public class ReverseOnlyLettersTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(ReverseOnlyLettersTest.class);

    @Autowired
    private ReverseOnlyLetters reverseOnlyLetters;

    @Test
    public void reverseOnlyLetters() {
        String s = "a-bC-dEf-ghIj";
        String reverseOnlyLetters = this.reverseOnlyLetters.reverseOnlyLetters(s);
        logger.info("result of {} is {}", s, reverseOnlyLetters);
    }
}