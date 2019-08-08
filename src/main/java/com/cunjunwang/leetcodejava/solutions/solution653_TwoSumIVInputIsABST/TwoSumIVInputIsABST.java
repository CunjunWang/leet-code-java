package com.cunjunwang.leetcodejava.solutions.solution653_TwoSumIVInputIsABST;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by CunjunWang on 2019-08-08.
 */
public class TwoSumIVInputIsABST {

    /**
     * Given a Binary Search Tree and a target number, return
     * true if there exist two elements in the BST such that
     * their sum is equal to the given target.
     *
     * Example 1:
     * Input:
     *     5
     *    / \
     *   3   6
     *  / \   \
     * 2   4   7
     * Target = 9
     * Output: True
     *
     * Example 2:
     * Input:
     *     5
     *    / \
     *   3   6
     *  / \   \
     * 2   4   7
     * Target = 28
     * Output: False
     *
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (root.val == k && root.left == null && root.right == null) return false;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode node = queue.remove();
            if (list.contains(k - node.val)) {
                return true;
            } else {
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return false;
    }

}
