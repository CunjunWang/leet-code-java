package com.cunjunwang.leetcodejava.solutions.solution111_MinimumDepthOfBinaryTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-24.
 */
@Component
public class MinimumDepthOfBinaryTree {

    /**
     * Given a binary tree, find its minimum depth.
     * The minimum depth is the number of nodes along the shortest
     * path from the root node down to the nearest leaf node.
     * <p>
     * Note: A leaf is a node with no children.
     * <p>
     * Example:
     * Given binary tree [3,9,20,null,null,15,7],
     * <p>
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * return its minimum depth = 2.
     *
     * @param root
     * @return
     */
    // TODO: solve with queue + iterative way
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        return (leftDepth == 0 || rightDepth == 0) ?
                leftDepth + rightDepth + 1 :
                Math.min(leftDepth, rightDepth) + 1;
    }

}
