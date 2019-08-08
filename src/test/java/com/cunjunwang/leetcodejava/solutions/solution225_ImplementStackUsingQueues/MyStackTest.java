package com.cunjunwang.leetcodejava.solutions.solution225_ImplementStackUsingQueues;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-08.
 */
public class MyStackTest extends LeetCodeJavaApplicationTests {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        logger.info("top = {}", stack.top());
        logger.info("pop = {}", stack.pop());
        logger.info("empty = {}", stack.empty());
    }

}