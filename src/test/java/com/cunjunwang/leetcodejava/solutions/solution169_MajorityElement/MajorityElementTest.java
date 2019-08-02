package com.cunjunwang.leetcodejava.solutions.solution169_MajorityElement;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-08-02.
 */
public class MajorityElementTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(MajorityElementTest.class);

    @Autowired
    private MajorityElement majorityElement;

    @Test
    public void majorityElement() {
        int[] nums = new int[]{3, 2, 3};
        int majorityElement = this.majorityElement.majorityElement(nums);
        logger.info("majority element in {} is: {}", nums, majorityElement);
    }
}