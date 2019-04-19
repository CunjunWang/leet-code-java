package com.cunjunwang.leetcodejava.solutions.solution167_TwoSumIIInputArrayIsSorted;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-04-19.
 */
public class TwoSumIIInputArrayIsSortedTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private TwoSumIIInputArrayIsSorted twoSumIIInputArrayIsSorted;

    @Test
    public void twoSum() {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSumIIInputArrayIsSorted.twoSum(arr, target);
        logger.info("Result = {}", result);
    }
}