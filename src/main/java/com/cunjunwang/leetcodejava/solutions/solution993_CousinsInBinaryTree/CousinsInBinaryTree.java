package com.cunjunwang.leetcodejava.solutions.solution993_CousinsInBinaryTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class CousinsInBinaryTree {

    /**
     * In a binary tree, the root node is at depth 0, and children
     * of each depth k node are at depth k+1.
     * Two nodes of a binary tree are cousins if they have the same
     * depth, but have different parents.
     * We are given the root of a binary tree with unique values,
     * and the values x and y of two different nodes in the tree.
     * Return true if and only if the nodes corresponding to the
     * values x and y are cousins.
     * <p>
     * Example 1:
     * Input: root = [1,2,3,4], x = 4, y = 3
     * Output: false
     * <p>
     * Example 2:
     * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
     * Output: true
     * <p>
     * Example 3:
     * Input: root = [1,2,3,null,4], x = 2, y = 3
     * Output: false
     *
     * @param root
     * @param x
     * @param y
     * @return
     */
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        if (root.val == x || root.val == y) return false;
        Map<Integer, TreeNode> parents = new HashMap<>();
        Map<Integer, Integer> depth = new HashMap<>();
        parents.put(root.val, null);
        depth.put(root.val, 0);
        searchNode(root, x, parents, depth, 0);
        searchNode(root, y, parents, depth, 0);
        return (depth.get(x).equals(depth.get(y)) && !parents.get(x).equals(parents.get(y)));
    }

    private void searchNode(TreeNode node, int val, Map<Integer, TreeNode> parents, Map<Integer, Integer> depth, int curDepth) {
        if (node == null) {
            return;
        }
        if ((node.left != null && node.left.val == val) || (node.right != null && node.right.val == val)) {
            parents.put(val, node);
            depth.put(val, curDepth + 1);
        }
        curDepth = curDepth + 1;
        searchNode(node.left, val, parents, depth, curDepth);
        searchNode(node.right, val, parents, depth, curDepth);
    }
}
