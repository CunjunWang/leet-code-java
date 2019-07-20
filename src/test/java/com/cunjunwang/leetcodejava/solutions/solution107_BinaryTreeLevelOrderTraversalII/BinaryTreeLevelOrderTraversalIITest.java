package com.cunjunwang.leetcodejava.solutions.solution107_BinaryTreeLevelOrderTraversalII;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by CunjunWang on 2019-07-20.
 */
public class BinaryTreeLevelOrderTraversalIITest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(BinaryTreeLevelOrderTraversalIITest.class);

    @Autowired
    private BinaryTreeLevelOrderTraversalII binaryTreeLevelOrderTraversalII;

    @Test
    public void levelOrderBottom() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        List<List<Integer>> lists = binaryTreeLevelOrderTraversalII.levelOrderBottom(root);
        logger.info("result = {}", lists);
    }
}