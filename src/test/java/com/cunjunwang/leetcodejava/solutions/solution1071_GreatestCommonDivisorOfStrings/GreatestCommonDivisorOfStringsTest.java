package com.cunjunwang.leetcodejava.solutions.solution1071_GreatestCommonDivisorOfStrings;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-08.
 */
public class GreatestCommonDivisorOfStringsTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings;

    @Test
    public void gcdOfStrings() {
        String str1 = "ABCABC", str2 = "ABC";
        String gcdOfStrings = greatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        logger.info("result = {}", gcdOfStrings);
    }
}