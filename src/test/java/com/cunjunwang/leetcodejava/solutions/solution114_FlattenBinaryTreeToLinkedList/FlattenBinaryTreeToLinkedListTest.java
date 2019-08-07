package com.cunjunwang.leetcodejava.solutions.solution114_FlattenBinaryTreeToLinkedList;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-08-07.
 */
public class FlattenBinaryTreeToLinkedListTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private FlattenBinaryTreeToLinkedList flattenBinaryTreeToLinkedList;

    @Test
    public void flatten() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(6);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        flattenBinaryTreeToLinkedList.flatten(root);
    }
}