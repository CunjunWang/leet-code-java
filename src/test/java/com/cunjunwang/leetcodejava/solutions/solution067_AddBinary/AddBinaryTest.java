package com.cunjunwang.leetcodejava.solutions.solution067_AddBinary;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-02-14.
 */
public class AddBinaryTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private AddBinary addBinary;

    @Test
    public void addBinary() {
        logger.info("测试开始");

        String binary1 = "11";
        String binary2 = "1";
        String result1 = addBinary.addBinary(binary1, binary2);
        Assert.assertEquals("100", result1);

        String binary3 = "1010";
        String binary4 = "1011";
        String result2 = addBinary.addBinary(binary3, binary4);
        Assert.assertEquals("10101", result2);

        logger.info("测试结束");
    }
}