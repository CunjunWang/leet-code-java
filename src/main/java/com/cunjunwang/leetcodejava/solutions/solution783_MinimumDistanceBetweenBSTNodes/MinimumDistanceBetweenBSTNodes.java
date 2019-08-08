package com.cunjunwang.leetcodejava.solutions.solution783_MinimumDistanceBetweenBSTNodes;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class MinimumDistanceBetweenBSTNodes {

    /**
     * Given a Binary Search Tree (BST) with the root node root, return
     * the minimum difference between the values of any two different nodes in the tree.
     *
     * Example :
     * Input: root = [4,2,6,1,3,null,null]
     * Output: 1
     * Explanation:
     * Note that root is a TreeNode object, not an array.
     * The given tree [4,2,6,1,3,null,null] is represented by the following diagram:
     *
     *           4
     *         /   \
     *       2      6
     *      / \
     *     1   3
     *
     * while the minimum difference in this tree is 1, it occurs between node 1 and
     * node 2, also between node 3 and node 2.
     *
     * @param root
     * @return
     */
    public int minDiffInBST(TreeNode root) {
        if (root == null) return 0;
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            int diff = list.get(i + 1) - list.get(i);
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }

    private void inOrder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }

}
