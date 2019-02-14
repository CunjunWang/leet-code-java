package com.cunjunwang.leetcodejava.solutions.solution088_MergeSortedArray;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Create by cunjunwang on 2019/2/14
 */
public class MergeSortedArrayTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger("Logger");

    @Autowired
    private MergeSortedArray mergeSortedArray;

    @Test
    public void merge() {
        logger.info("开始测试");
//        int m = 3;
//        int n = 3;
//        int[] arr1 = {1,2,3,0,0,0};
//        int[] arr2 = {2,5,6};
//        mergeSortedArray.merge(arr1, m, arr2, n);

        int m = 0;
        int n = 1;
        int[] arr1 = {0};
        int[] arr2 = {1};
        mergeSortedArray.merge(arr1, m, arr2, n);
        logger.info("测试结果: nums1={}", arr1);
    }
}