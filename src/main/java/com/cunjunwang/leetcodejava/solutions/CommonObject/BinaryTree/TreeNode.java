package com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree;

import lombok.ToString;

/**
 * Created by CunjunWang on 2019-04-08.
 */
@ToString
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

}