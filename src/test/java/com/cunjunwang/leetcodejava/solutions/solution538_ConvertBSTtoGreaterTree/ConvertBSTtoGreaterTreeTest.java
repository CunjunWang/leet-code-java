package com.cunjunwang.leetcodejava.solutions.solution538_ConvertBSTtoGreaterTree;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-06-15.
 */
public class ConvertBSTtoGreaterTreeTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(ConvertBSTtoGreaterTreeTest.class);

    @Autowired
    private ConvertBSTtoGreaterTree convertBSTtoGreaterTree;

    @Test
    public void convertBST() {
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(13);
        TreeNode leftLeft = new TreeNode(1);
        TreeNode leftRight = new TreeNode(4);
        TreeNode rightLeft = new TreeNode(11);
        TreeNode rightRight = new TreeNode(15);
        root.left = left;
        root.right = right;
        left.left = leftLeft;
        left.right = leftRight;
        right.left = rightLeft;
        right.right = rightRight;
        logger.info("root: {}", root);
        TreeNode result = convertBSTtoGreaterTree.convertBST(root);
        logger.info("result = {}", result);
    }
}