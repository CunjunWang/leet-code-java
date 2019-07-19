package com.cunjunwang.leetcodejava.solutions.solution058_LengthOfLastWord;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-19.
 */
public class LengthOfLastWordTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(LengthOfLastWordTest.class);

    @Autowired
    private LengthOfLastWord lengthOfLastWord;

    @Test
    public void lengthOfLastWord() {
        String s = "Hello World";
        int i = lengthOfLastWord.lengthOfLastWord(s);
        logger.info("result = {}", i);
    }
}