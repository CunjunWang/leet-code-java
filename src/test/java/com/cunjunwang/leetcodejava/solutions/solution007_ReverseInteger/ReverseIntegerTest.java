package com.cunjunwang.leetcodejava.solutions.solution007_ReverseInteger;

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
public class ReverseIntegerTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private ReverseInteger reverseInteger;

    @Test
    public void reverse() {
        logger.info("开始测试");
        Integer result1 = reverseInteger.reverse(0);
        Integer result2 = reverseInteger.reverse(123);
        Integer result3 = reverseInteger.reverse(-123);
        Integer result4 = reverseInteger.reverse(120);
        Assert.assertEquals(new Integer(0), result1);
        Assert.assertEquals(new Integer(321), result2);
        Assert.assertEquals(new Integer(-321), result3);
        Assert.assertEquals(new Integer(21), result4);
        logger.info("测试完毕");
    }
}