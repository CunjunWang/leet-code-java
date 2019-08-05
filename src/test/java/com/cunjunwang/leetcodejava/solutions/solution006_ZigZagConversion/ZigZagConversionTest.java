package com.cunjunwang.leetcodejava.solutions.solution006_ZigZagConversion;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-05.
 */
public class ZigZagConversionTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private ZigZagConversion zigZagConversion;

    @Test
    public void convert() {
        String s = "AB";
        int numRows = 1;
        String convert = zigZagConversion.convert(s, numRows);
        logger.info("result = {}", convert);
    }
}