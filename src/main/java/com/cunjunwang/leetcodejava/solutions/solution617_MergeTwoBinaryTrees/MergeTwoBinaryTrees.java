package com.cunjunwang.leetcodejava.solutions.solution617_MergeTwoBinaryTrees;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-18.
 */
@Component
public class MergeTwoBinaryTrees {

    /**
     * Given two binary trees and imagine that when you put one of them to cover
     * the other, some nodes of the two trees are overlapped while the others are not.
     * <p>
     * You need to merge them into a new binary tree. The merge rule is that if
     * two nodes overlap, then sum node values up as the new value of the merged
     * node. Otherwise, the NOT null node will be used as the node of new tree.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * Tree 1                     Tree 2
     *       1                         2
     *      / \                       / \
     *     3   2                     1   3
     *    /                           \   \
     *   5                             4   7
     * Output:
     * Merged tree:
     *       3
     *      / \
     *     4   5
     *    / \   \
     *   5   4   7
     *
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        } else if (t1 == null && t2 != null) {
            return t2;
        } else if (t1 != null && t2 == null) {
            return t1;
        } else {
            t1.val = t1.val + t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
            return t1;
        }
    }

}
