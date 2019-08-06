package com.cunjunwang.leetcodejava.solutions.solution324_WiggleSortII;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-05.
 */
public class WiggleSortIITest extends LeetCodeJavaApplicationTests {

    @Autowired
    private WiggleSortII wiggleSortII;

    @Test
    public void wiggleSort() {
        int[] nums = new int[]{1, 1, 2, 1, 2, 2, 1};
        wiggleSortII.wiggleSort(nums);
        logger.info("sorted array = {}", nums);
    }
}