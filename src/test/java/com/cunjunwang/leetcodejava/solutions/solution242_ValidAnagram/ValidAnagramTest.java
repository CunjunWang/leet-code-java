package com.cunjunwang.leetcodejava.solutions.solution242_ValidAnagram;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-04-19.
 */
public class ValidAnagramTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private ValidAnagram validAnagram;

    @Test
    public void isAnagram() {
        String s1 = "anagram";
        String t1 = "nagaram";
        boolean result1 =  validAnagram.isAnagram(s1, t1);
        logger.info("Result 1 = {}", result1);
        Assert.assertTrue(result1);


        String s2 = "car";
        String t2 = "rat";
        boolean result2 = validAnagram.isAnagram(s2, t2);
        logger.info("Result 2 = {}", result2);
        Assert.assertFalse(result2);
    }
}