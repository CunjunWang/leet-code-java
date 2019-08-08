package com.cunjunwang.leetcodejava.solutions.solution530_MinimumAbsoluteDifferenceInBST;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-08-08.
 */
@Component
public class MinimumAbsoluteDifferenceInBST {

    /**
     * Given a binary search tree with non-negative values, find
     * the minimum absolute difference between values of any two nodes.
     * <p>
     * Example:
     * Input:
     * <p>
     * 1
     * \
     * 3
     * /
     * 2
     * <p>
     * Output:
     * 1
     * <p>
     * Explanation:
     * The minimum absolute difference is 1, which is the difference
     * between 2 and 1 (or between 2 and 3).
     *
     * @param root
     * @return
     */
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            int diff = list.get(i + 1) - list.get(i);
            min = Math.min(min, diff);
        }
        return min;
    }

    private void inOrder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }

}
