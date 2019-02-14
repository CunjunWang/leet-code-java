package com.cunjunwang.leetcodejava.solutions.solution412_FizzBuzz;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Create by cunjunwang on 2019/2/14
 */
public class FizzBuzzTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private FizzBuzz fizzBuzz;

    @Test
    public void fizzBuzz() {
        logger.info("测试开始");
        int n = 100;
        List<String> result = fizzBuzz.fizzBuzz(n);
        logger.info("测试结束, 结果: {}", result);
    }
}