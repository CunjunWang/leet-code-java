package com.cunjunwang.leetcodejava.solutions.solution111_MinimumDepthOfBinaryTree;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-24.
 */
public class MinimumDepthOfBinaryTreeTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(MinimumDepthOfBinaryTreeTest.class);

    @Autowired
    private MinimumDepthOfBinaryTree minimumDepthOfBinaryTree;

    @Test
    public void minDepth() {
//        TreeNode root = new TreeNode(3);
//        TreeNode node1 = new TreeNode(9);
//        TreeNode node2 = new TreeNode(20);
//        TreeNode node3 = new TreeNode(15);
//        TreeNode node4 = new TreeNode(7);
//        root.left = node1;
//        root.right = node2;
//        node2.left = node3;
//        node2.right = node4;
//        int depth = minimumDepthOfBinaryTree.minDepth(root);
//        logger.info("min depth = {}", depth);

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        root.left = node1;
        int depth = minimumDepthOfBinaryTree.minDepth(root);
        logger.info("min depth = {}", depth);
    }
}