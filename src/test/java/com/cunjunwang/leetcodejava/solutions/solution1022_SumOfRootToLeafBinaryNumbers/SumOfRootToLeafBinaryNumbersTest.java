package com.cunjunwang.leetcodejava.solutions.solution1022_SumOfRootToLeafBinaryNumbers;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-07.
 */
public class SumOfRootToLeafBinaryNumbersTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private SumOfRootToLeafBinaryNumbers sumOfRootToLeafBinaryNumbers;

    @Test
    public void sumRootToLeaf() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        int sum = sumOfRootToLeafBinaryNumbers.sumRootToLeaf(root);
        logger.info("result = {}", sum);
    }
}