package com.cunjunwang.leetcodejava.solutions.solution415_AddStrings;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-04-25.
 */
public class AddStringsTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(AddStringsTest.class);

    @Autowired
    private AddStrings addStrings;


    @Test
    public void addStrings() {
        String num1 = "9";
        String num2 = "99";
        String result = addStrings.addStrings(num1, num2);
        logger.info("result = {}", result);
    }
}