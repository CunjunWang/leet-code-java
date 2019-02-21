package com.cunjunwang.leetcodejava.solutions.solution844_BackspaceStringCompare;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-02-21.
 */
public class BackspaceStringCompareTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private BackspaceStringCompare backspaceStringCompare;

    @Test
    public void backspaceCompare() {
        logger.info("测试开始");

//        String S1 = "ab#c";
//        String T1 = "ad#c";
//        boolean result1 = backspaceStringCompare.backspaceCompare(S1, T1);
//        Assert.assertTrue(result1);
//
//        String S2 = "ab##";
//        String T2 = "c#d#";
//        boolean result2 = backspaceStringCompare.backspaceCompare(S2, T2);
//        Assert.assertTrue(result2);
//
//        String S3 = "a##c";
//        String T3 = "#a#c";
//        boolean result3 = backspaceStringCompare.backspaceCompare(S3, T3);
//        Assert.assertTrue(result3);
//
//        String S4 = "a#c";
//        String T4 = "b";
//        boolean result4 = backspaceStringCompare.backspaceCompare(S4, T4);
//        Assert.assertFalse(result4);

        String S5 = "oi###mupo##rszty#s#xu###bxx##dqc#gdjz";
        String T5 = "oi###mupo##rszty#s#xu####bxx##dqc#gdjz";
        boolean result5 = backspaceStringCompare.backspaceCompare(S5, T5);
        Assert.assertFalse(result5);

        logger.info("测试结束");
    }
}