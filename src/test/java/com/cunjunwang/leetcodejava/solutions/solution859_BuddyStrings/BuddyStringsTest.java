package com.cunjunwang.leetcodejava.solutions.solution859_BuddyStrings;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-18.
 */
public class BuddyStringsTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(BuddyStringsTest.class);

    @Autowired
    private BuddyStrings buddyStrings;

    @Test
    public void buddyStrings() {

        String A4 = "aa", B4 = "aa";
        boolean result4 = buddyStrings.buddyStrings(A4, B4);
        logger.info("result4 = {}", result4);

        String A3 = "ab", B3 = "ab";
        boolean result3 = buddyStrings.buddyStrings(A3, B3);
        logger.info("result3 = {}", result3);

        String A1 = "ab", B1 = "ba";
        boolean result1 = buddyStrings.buddyStrings(A1, B1);
        logger.info("result1 = {}", result1);

        String A2 = "aaaaaaabc", B2 = "aaaaaaacb";
        boolean result2 = buddyStrings.buddyStrings(A2, B2);
        logger.info("result2 = {}", result2);

    }
}