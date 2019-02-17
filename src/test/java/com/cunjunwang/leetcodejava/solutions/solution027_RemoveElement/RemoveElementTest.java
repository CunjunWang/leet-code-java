package com.cunjunwang.leetcodejava.solutions.solution027_RemoveElement;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Create by cunjunwang on 2019/2/17
 */
public class RemoveElementTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private RemoveElement removeElement;

    @Test
    public void removeElement() {
        logger.info("开始测试");

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int result1 = removeElement.removeElement(nums1, val1);
        logger.info("结果1: {}", result1);

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int result2 = removeElement.removeElement(nums2, val2);
        logger.info("结果2: {}", result2);
    }
}