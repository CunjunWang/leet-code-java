package com.cunjunwang.leetcodejava.solutions.solution125_ValidPalindrome;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-04-19.
 */
public class ValidPalindromeTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private ValidPalindrome validPalindrome;

    @Test
    public void isPalindrome() {
        String s1 = "A man, a plan, a canal: Panama";
        boolean result1 = validPalindrome.isPalindrome(s1);
        Assert.assertTrue(result1);

        String s2 = "race a car";
        boolean result2 = validPalindrome.isPalindrome(s2);
        Assert.assertFalse(result2);

        String s3 =  "0P";
        boolean result3 = validPalindrome.isPalindrome(s3);
        Assert.assertFalse(result3);

    }
}