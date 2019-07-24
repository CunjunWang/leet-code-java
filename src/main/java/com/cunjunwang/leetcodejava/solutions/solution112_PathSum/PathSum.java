package com.cunjunwang.leetcodejava.solutions.solution112_PathSum;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-24.
 */
@Component
public class PathSum {

    /**
     * Given a binary tree and a sum, determine if the tree has a root-to-leaf
     * path such that adding up all the values along the path equals the given sum.
     * Note: A leaf is a node with no children.
     *
     * Example:
     * Given the below binary tree and sum = 22,
     *
     *       5
     *      / \
     *     4   8
     *    /   / \
     *   11  13  4
     *  /  \      \
     * 7    2      1
     *
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        // go to a leaf node and val = sum
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }

        return hasPathSum(root.left, sum - root.val) ||
                hasPathSum(root.right, sum - root.val);
    }
}
