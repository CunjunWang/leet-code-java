package com.cunjunwang.leetcodejava.solutions.solution108_ConvertSortedArrayToBinarySearchTree;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-20.
 */
public class ConvertSortedArrayToBinarySearchTreeTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(ConvertSortedArrayToBinarySearchTreeTest.class);

    @Autowired
    private ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree;

    @Test
    public void sortedArrayToBST() {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode treeNode = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);
        logger.info("result = {}", treeNode);
    }
}