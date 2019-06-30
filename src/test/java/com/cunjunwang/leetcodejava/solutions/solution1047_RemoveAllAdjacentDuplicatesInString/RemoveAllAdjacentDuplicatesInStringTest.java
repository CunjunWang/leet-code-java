package com.cunjunwang.leetcodejava.solutions.solution1047_RemoveAllAdjacentDuplicatesInString;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-06-30.
 */
public class RemoveAllAdjacentDuplicatesInStringTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(RemoveAllAdjacentDuplicatesInStringTest.class);

    @Autowired
    private RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString;

    @Test
    public void removeDuplicates() {
        String test = "abbaca";
        String result = removeAllAdjacentDuplicatesInString.removeDuplicates(test);
        logger.info("result = {}", result);
    }


}