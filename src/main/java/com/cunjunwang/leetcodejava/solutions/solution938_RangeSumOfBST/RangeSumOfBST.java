package com.cunjunwang.leetcodejava.solutions.solution938_RangeSumOfBST;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-17.
 */
@Component
public class RangeSumOfBST {

    private int sum = 0;

    /**
     * Given the root node of a binary search tree, return the sum
     * of values of all nodes with value between L and R (inclusive).
     * <p>
     * The binary search tree is guaranteed to have unique values.
     * <p>
     * Example 1:
     * Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
     * Output: 32
     * <p>
     * Example 2:
     * Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
     * Output: 23
     * <p>
     * Note:
     * The number of nodes in the tree is at most 10000.
     * The final answer is guaranteed to be less than 2^31.
     *
     * @param root
     * @param L
     * @param R
     * @return
     */
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (L <= root.val && root.val <= R) {
            sum += root.val;
        }
        rangeSumBST(root.left, L, R);
        rangeSumBST(root.right, L, R);
        return sum;
    }

}
