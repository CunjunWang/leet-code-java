package com.cunjunwang.leetcodejava.solutions.solution094_BinaryTreeInorderTraversal;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class BinaryTreeInorderTraversal {

    /**
     * Given a binary tree, return the inorder traversal
     * of its nodes' values.
     * <p>
     * Example:
     * Input: [1,null,2,3]
     * 1
     * \
     * 2
     * /
     * 3
     * Output: [1,3,2]
     * <p>
     * Follow up: Recursive solution is trivial, could you do it iteratively?
     *
     * @param root
     * @return
     */
    // TODO: do it iteratively
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    private void inOrder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }

}
