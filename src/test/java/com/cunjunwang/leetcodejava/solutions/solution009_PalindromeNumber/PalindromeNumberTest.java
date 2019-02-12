package com.cunjunwang.leetcodejava.solutions.solution009_PalindromeNumber;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Create by cunjunwang on 2019/2/12
 */
public class PalindromeNumberTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private PalindromeNumber palindromeNumber;

    @Test
    public void isPalindrome() {
        logger.info("测试开始");
        boolean result1 = palindromeNumber.isPalindrome(0);
        boolean result2 = palindromeNumber.isPalindrome(123);
        boolean result3 = palindromeNumber.isPalindrome(121);
        boolean result4 = palindromeNumber.isPalindrome(123454321);
        boolean result5 = palindromeNumber.isPalindrome(-125);
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
        Assert.assertTrue(result4);
        Assert.assertFalse(result5);
        logger.info("测试结束");
    }
}