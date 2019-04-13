package com.cunjunwang.leetcodejava.solutions.solution349_IntersectionOfTwoArrays;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-04-13.
 */
public class IntersectionOfTwoArraysTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private IntersectionOfTwoArrays intersectionOfTwoArrays;

    @Test
    public void intersection() {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        int[] result1 = intersectionOfTwoArrays.intersection(nums1, nums2);
        logger.info("result 1 = {}", result1);
        Assert.assertEquals(1, result1.length);

        int[] nums3 = new int[]{4,9,5};
        int[] nums4 = new int[]{9,4,9,8,4};
        int[] result2 = intersectionOfTwoArrays.intersection(nums3, nums4);
        logger.info("result 2 = {}", result2);
        Assert.assertEquals(2, result2.length);
    }
}