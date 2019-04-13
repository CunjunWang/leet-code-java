package com.cunjunwang.leetcodejava.solutions.solution543_DiameterOfBinaryTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-04-08.
 */

@Component
public class DiameterOfBinaryTree {

    private int max = 0;

    /**
     * Given a binary tree, you need to compute the length of the diameter of the tree.
     * The diameter of a binary tree is the length of the longest path between any two
     * nodes in a tree. This path may or may not pass through the root.
     * <p>
     * Example:
     * Given a binary tree
     * 1
     * / \
     * 2   3
     * / \
     * 4   5
     * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
     * <p>
     * Note: The length of path between two nodes is represented by the number of edges between them.
     *
     * @param root
     * @return
     */
    // TODO: 整理思路
    // 坑: 答案不是left height + right height!!!
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        depth(root);
        return max;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        max = Math.max(max, left + right);
        return 1 + Math.max(left, right);
    }

}
