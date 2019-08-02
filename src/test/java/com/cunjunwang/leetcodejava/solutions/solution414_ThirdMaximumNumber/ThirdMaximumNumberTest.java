package com.cunjunwang.leetcodejava.solutions.solution414_ThirdMaximumNumber;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-08-02.
 */
public class ThirdMaximumNumberTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(ThirdMaximumNumberTest.class);

    @Autowired
    private ThirdMaximumNumber thirdMaximumNumber;

    @Test
    public void thirdMax() {
        int[] nums = new int[]{3, 2, 1};
        int thirdMax = thirdMaximumNumber.thirdMax(nums);
        logger.info("Third max in {} is: {}", nums, thirdMax);
    }
}