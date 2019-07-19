package com.cunjunwang.leetcodejava.solutions.solution026_RemoveDuplicatesFromSortedArray;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-19.
 */
public class RemoveDuplicatesFromSortedArrayTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(RemoveDuplicatesFromSortedArrayTest.class);

    @Autowired
    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @Test
    public void removeDuplicates() {
        int[] nums1 = new int[]{1, 1, 2};
        int i1 = removeDuplicatesFromSortedArray.removeDuplicates(nums1);
        logger.info("result1 = {}", i1);

        int[] nums2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i2 = removeDuplicatesFromSortedArray.removeDuplicates(nums2);
        logger.info("result1 = {}", i2);
    }
}