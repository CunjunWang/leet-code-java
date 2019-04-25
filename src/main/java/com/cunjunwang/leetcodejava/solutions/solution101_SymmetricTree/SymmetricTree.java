package com.cunjunwang.leetcodejava.solutions.solution101_SymmetricTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-04-25.
 */
@Component
public class SymmetricTree {

    /**
     * Given a binary tree, check whether it is a mirror of itself
     * (ie, symmetric around its center).
     *
     * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
     *
     *     1
     *    / \
     *   2   2
     *  / \ / \
     * 3  4 4  3
     * But the following [1,2,2,null,3,null,3] is not:
     *     1
     *    / \
     *   2   2
     *    \   \
     *    3    3
     * Note:
     * Bonus points if you could solve it both recursively and iteratively.
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return (node1.val == node2.val) &&
                isSymmetric(node1.left, node2.right) &&
                isSymmetric(node1.right, node2.left);
    }

}
