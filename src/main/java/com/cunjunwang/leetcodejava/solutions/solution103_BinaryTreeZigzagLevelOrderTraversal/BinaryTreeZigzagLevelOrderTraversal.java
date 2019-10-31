package com.cunjunwang.leetcodejava.solutions.solution103_BinaryTreeZigzagLevelOrderTraversal;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.*;

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
        // tree level order traversal
        List<List<Integer>> res = new ArrayList<>();

        if (root == null)
            return res;

        int level = 0;
        Queue<TreeNode> todo = new LinkedList<>();
        todo.offer(root);

        while (!todo.isEmpty()) {
            List<Integer> innerList = new ArrayList<>();
            int size = todo.size();

            for (int i = 0; i < size; i++) {
                TreeNode cur = todo.poll();
                innerList.add(cur.val);
                if (cur.left != null) {
                    todo.offer(cur.left);
                }
                if (cur.right != null) {
                    todo.offer(cur.right);
                }
            }

            if (level % 2 == 0) {
                res.add(innerList);
            } else {
                Collections.reverse(innerList);
                res.add(innerList);
            }
            level++;
        }

        return res;
    }

}
