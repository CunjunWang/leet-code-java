package com.cunjunwang.leetcodejava.solutions.solution103_BinaryTreeZigzagLevelOrderTraversal;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class BinaryTreeZigzagLevelOrderTraversal {

    /**
     * Given a binary tree, return the zigzag level order traversal of
     * its nodes' values. (ie, from left to right, then right to left
     * for the next level and alternate between).
     * <p>
     * For example:
     * Given binary tree [3,9,20,null,null,15,7],
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * return its zigzag level order traversal as:
     * [
     * [3],
     * [20,9],
     * [15,7]
     * ]
     *
     * @param root
     * @return
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> innerList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                innerList.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (level % 2 == 0) {
                list.add(innerList);
            } else {
                List<Integer> reverse = new ArrayList<>();
                for (int i = innerList.size() - 1; i >= 0; i--) {
                    reverse.add(innerList.get(i));
                }
                list.add(reverse);
            }
            level++;
        }
        return list;
    }

}
