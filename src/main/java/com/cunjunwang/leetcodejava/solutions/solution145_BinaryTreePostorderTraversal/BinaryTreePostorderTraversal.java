package com.cunjunwang.leetcodejava.solutions.solution145_BinaryTreePostorderTraversal;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class BinaryTreePostorderTraversal {

    /**
     * Given a binary tree, return the postorder traversal of
     * its nodes' values.
     * <p>
     * Example:
     * Input: [1,null,2,3]
     * 1
     * \
     * 2
     * /
     * 3
     * Output: [3,2,1]
     * Follow up: Recursive solution is trivial, could you do it iteratively?
     *
     * @param root
     * @return
     */
    // TODO: do it iteratively
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    private void postOrder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postOrder(node.left, result);
        postOrder(node.right, result);
        result.add(node.val);
    }

}
