package com.cunjunwang.leetcodejava.solutions.solution013_RomanToInteger;

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
public class RomanToIntegerTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private RomanToInteger romanToInteger;

    @Test
    public void romanToInt() {
        logger.info("开始测试");

        Integer result1 = romanToInteger.romanToInt("III");
        Assert.assertEquals(new Integer(3), result1);

        Integer result2 = romanToInteger.romanToInt("IV");
        Assert.assertEquals(new Integer(4), result2);

        Integer result3 = romanToInteger.romanToInt("IX");
        Assert.assertEquals(new Integer(9), result3);

        Integer result4 = romanToInteger.romanToInt("LVIII");
        Assert.assertEquals(new Integer(58), result4);

        Integer result5 = romanToInteger.romanToInt("MCMXCIV");
        Assert.assertEquals(new Integer(1994), result5);

        logger.info("测试结束");
    }
}