package com.cunjunwang.leetcodejava.solutions.solution538_ConvertBSTtoGreaterTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-06-15.
 */
@Component
public class ConvertBSTtoGreaterTree {

    private Integer sum = 0;

    /**
     * Given a Binary Search Tree (BST), convert it to a Greater Tree such that
     * every key of the original BST is changed to the original key plus sum of
     * all keys greater than the original key in BST.
     * <p>
     * Example:
     * <p>
     * Input: The root of a Binary Search Tree like this:
     *        5
     *      /   \
     *    2     13
     *   / \    / \
     *  1  4  11   15
     * <p>
     * Output: The root of a Greater Tree like this:
     *         44
     *       /    \
     *     50     28
     *    / \    /  \
     *  51  48  39  15
     *
     * @param root
     * @return
     */
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        sum = sum + root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }

}
