package com.cunjunwang.leetcodejava.solutions.solution0366_FindLeavesOfBinaryTree;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-10-28.
 */
public class FindLeavesOfBinaryTreeTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private FindLeavesOfBinaryTree findLeavesOfBinaryTree;

    @Test
    public void findLeaves() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        List<List<Integer>> res = findLeavesOfBinaryTree.findLeaves(root);
        logger.info("Res = {}", res);
    }
}