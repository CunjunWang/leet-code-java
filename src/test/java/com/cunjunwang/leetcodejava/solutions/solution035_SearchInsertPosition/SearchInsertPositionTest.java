package com.cunjunwang.leetcodejava.solutions.solution035_SearchInsertPosition;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-19.
 */
public class SearchInsertPositionTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(SearchInsertPositionTest.class);

    @Autowired
    private SearchInsertPosition searchInsertPosition;

    @Test
    public void searchInsert() {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        int i = searchInsertPosition.searchInsert(nums, target);
        logger.info("result = {}", i);

        nums = new int[]{1, 3, 5, 6};
        target = 2;
        i = searchInsertPosition.searchInsert(nums, target);
        logger.info("result = {}", i);

        nums = new int[]{1, 3, 5, 6};
        target = 7;
        i = searchInsertPosition.searchInsert(nums, target);
        logger.info("result = {}", i);

        nums = new int[]{1, 3, 5, 6};
        target = 0;
        i = searchInsertPosition.searchInsert(nums, target);
        logger.info("result = {}", i);
    }
}