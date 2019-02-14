package com.cunjunwang.leetcodejava.solutions.solution344_ReverseString;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-02-14.
 */
public class ReverseStringTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private ReverseString reverseString;

    @Test
    public void reverseString() {
        logger.info("测试开始");
        char[] char1 = {'h','e','l','l','o'};
        reverseString.reverseString(char1);
        logger.info("测试结束, 结果: {}", char1);
    }
}