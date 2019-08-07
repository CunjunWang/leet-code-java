package com.cunjunwang.leetcodejava.solutions.solution637_AverageOfLevelsInBinaryTree;

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
public class AverageOfLevelsInBinaryTree {

    /**
     * Given a non-empty binary tree, return the average value
     * of the nodes on each level in the form of an array.
     * <p>
     * Example 1:
     * Input:
     *      3
     *     / \
     *    9  20
     *      /  \
     *     15   7
     * Output: [3, 14.5, 11]
     * Explanation:
     * The average value of nodes on level 0 is 3,  on level 1 is 14.5,
     * and on level 2 is 11. Hence return [3, 14.5, 11].
     * <p>
     * Note:
     * The range of node's value is in the range of 32-bit signed integer.
     *
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            double levelSum = 0.0;
            int levelCount = queue.size();
            for (int i = 0; i < levelCount; i++) {
                TreeNode node = queue.remove();
                levelSum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            double average = levelSum / levelCount;
            result.add(average);
        }
        return result;
    }

}
