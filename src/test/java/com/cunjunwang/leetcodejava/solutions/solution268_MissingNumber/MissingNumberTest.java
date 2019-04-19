package com.cunjunwang.leetcodejava.solutions.solution268_MissingNumber;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-04-19.
 */
public class MissingNumberTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private MissingNumber missingNumber;

    @Test
    public void missingNumber() {
        int[] nums1 = new int[]{2, 0, 3};
        int result1 = missingNumber.missingNumber(nums1);
        Assert.assertEquals(1, result1);
    }
}