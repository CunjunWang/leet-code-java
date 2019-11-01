package com.cunjunwang.leetcodejava.solutions.solution1120_MaximumAverageSubtree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;

/**
 * Created by CunjunWang on 2019-11-01.
 */
public class MaximumAverageSubtree {

    // post order traversal the tree

    private class Avg {

        // the number of nodes in the current subtree
        public int num;

        // the sum of the current subtree
        public int sum;

        public Avg(int num, int sum) {
            this.num = num;
            this.sum = sum;
        }
    }

    private double max;

    public double maximumAverageSubtree(TreeNode root) {
        max = 0;
        if (root == null)
            return max;

        recursiveAvg(root);

        return max;
    }

    private Avg recursiveAvg(TreeNode root) {
        if (root == null) {
            return new Avg(0, 0);
        }

        Avg left = recursiveAvg(root.left);
        Avg right = recursiveAvg(root.right);

        int num = left.num + right.num + 1;
        int sum = left.sum + right.sum + root.val;

        double avg = (double) sum / num;

        max = Math.max(max, avg);

        return new Avg(num, sum)
    }
}
