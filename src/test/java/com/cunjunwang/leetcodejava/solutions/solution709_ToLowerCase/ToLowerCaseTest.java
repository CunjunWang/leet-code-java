package com.cunjunwang.leetcodejava.solutions.solution709_ToLowerCase;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-17.
 */
public class ToLowerCaseTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(ToLowerCaseTest.class);

    @Autowired
    private ToLowerCase toLowerCase;

    @Test
    public void toLowerCase() {
        String string = "HellO123";
        String lowerCase = toLowerCase.toLowerCase(string);
        logger.info("lower case = {}", lowerCase);
    }
}