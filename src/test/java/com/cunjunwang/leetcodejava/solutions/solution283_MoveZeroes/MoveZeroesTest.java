package com.cunjunwang.leetcodejava.solutions.solution283_MoveZeroes;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Create by cunjunwang on 2019/2/17
 */
public class MoveZeroesTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private MoveZeroes moveZeroes;

    @Test
    public void moveZeroes() {
        logger.info("开始测试");
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        logger.info("测试结束, 结果: {}", nums);
    }
}