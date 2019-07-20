package com.cunjunwang.leetcodejava.solutions.solution104_MaximumDepthOfBinaryTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-19.
 */
@Component
public class MaximumDepthOfBinaryTree {

    /**
     * Given a binary tree, find its maximum depth.
     * The maximum depth is the number of nodes along the
     * longest path from the root node down to the farthest leaf node.
     * Note: A leaf is a node with no children.
     * <p>
     * Example:
     * Given binary tree [3,9,20,null,null,15,7],
     * <p>
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * return its depth = 3.
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
    }

}
