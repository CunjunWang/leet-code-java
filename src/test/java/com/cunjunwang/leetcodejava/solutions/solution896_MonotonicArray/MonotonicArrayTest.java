package com.cunjunwang.leetcodejava.solutions.solution896_MonotonicArray;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-08.
 */
public class MonotonicArrayTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private MonotonicArray monotonicArray;

    @Test
    public void isMonotonic() {
        int[] arr = new int[]{11, 11, 9, 4, 3, 3, 3, 1, -1, -1, 3, 3, 3, 5, 5, 5};
        boolean monotonic = monotonicArray.isMonotonic(arr);
        logger.info("result = {}", monotonic);
    }
}