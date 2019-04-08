package com.cunjunwang.leetcodejava.solutions.solution716_MaxStack;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-04-08.
 */
@Component
public class MaxStackTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(MaxStackTest.class);

    @Test
    public void test() {
        MaxStack maxStack = new MaxStack();
        logger.info("初始化: {}", maxStack);
        maxStack.push(5);
        maxStack.push(1);
        maxStack.push(5);
        logger.info("pop: {}", maxStack.pop());
        logger.info("popMax: {}", maxStack.popMax());
        logger.info("top: {}", maxStack.top());
        logger.info("peekMax: {}", maxStack.peekMax());
        logger.info("pop: {}", maxStack.pop());
        logger.info("pop: {}", maxStack.pop());
    }
}