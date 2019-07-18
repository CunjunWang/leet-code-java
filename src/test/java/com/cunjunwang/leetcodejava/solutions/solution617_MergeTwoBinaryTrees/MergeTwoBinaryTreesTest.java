package com.cunjunwang.leetcodejava.solutions.solution617_MergeTwoBinaryTrees;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-18.
 */
public class MergeTwoBinaryTreesTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(MergeTwoBinaryTreesTest.class);

    @Autowired
    private MergeTwoBinaryTrees mergeTwoBinaryTrees;

    @Test
    public void mergeTrees() {
        TreeNode root1 = new TreeNode(1);
        TreeNode t11 = new TreeNode(3);
        TreeNode t12 = new TreeNode(2);
        TreeNode t13 = new TreeNode(5);
        root1.left = t11;
        root1.right = t12;
        t11.left = t13;

        TreeNode root2 = new TreeNode(2);
        TreeNode t21 = new TreeNode(1);
        TreeNode t22 = new TreeNode(3);
        TreeNode t23 = new TreeNode(4);
        TreeNode t24 = new TreeNode(7);
        root2.left = t21;
        root2.right = t22;
        t21.right = t23;
        t22.right = t24;

        TreeNode treeNode = mergeTwoBinaryTrees.mergeTrees(root1, root2);
        logger.info("result = {}", treeNode);
    }
}