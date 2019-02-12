package com.cunjunwang.leetcodejava.solutions.solution771_JewelsAndStones;

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
public class JewelsAndStonesTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private JewelsAndStones jewelsAndStones;

    @Test
    public void numJewelsInStones() {
        logger.info("开始测试");

        String j1 = "aA";
        String s1 = "aAAbbbb";
        int result1 = jewelsAndStones.numJewelsInStones(j1, s1);
        Assert.assertEquals(3, result1);

        String j2 = "z";
        String s2 = "ZZ";
        int result2 = jewelsAndStones.numJewelsInStones(j2, s2);
        Assert.assertEquals(0, result2);

        logger.info("测试结束");
    }
}