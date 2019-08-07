package com.cunjunwang.leetcodejava.solutions.solution1022_SumOfRootToLeafBinaryNumbers;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class SumOfRootToLeafBinaryNumbers {

    /**
     * Given a binary tree, each node has value 0 or 1.  Each root-to-leaf
     * path represents a binary number starting with the most significant bit.
     * For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could
     * represent 01101 in binary, which is 13.
     * For all leaves in the tree, consider the numbers represented by the
     * path from the root to that leaf.
     * Return the sum of these numbers.
     * <p>
     * Example 1:
     * Input: [1,0,1,0,1,0,1]
     * Output: 22
     * Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
     * <p>
     * Note:
     * The number of nodes in the tree is between 1 and 1000.
     * node.val is 0 or 1.
     * The answer will not exceed 2^31 - 1.
     *
     * @param root
     * @return
     */
    public int sumRootToLeaf(TreeNode root) {
        List<String> paths = getPaths(root);
        if (paths.isEmpty()) return 0;
        int sum = 0;
        for (String path : paths) {
            int pathSum = 0;
            int start = path.length() - 1;
            for (int i = 0; i < path.length(); i++) {
                int val = Integer.valueOf(path.substring(i, i + 1));
                pathSum += val * Math.pow(2.0, start);
                start--;
            }
            sum += pathSum;
        }
        return sum;
    }

    private List<String> getPaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        String path = "";
        getPathsRecursive(root, path, paths);
        return paths;
    }

    private void getPathsRecursive(TreeNode node, String path, List<String> paths) {
        if (node == null) return;
        path = path + node.val;
        if (node.left == null && node.right == null) {
            paths.add(path);
        }
        getPathsRecursive(node.left, path, paths);
        getPathsRecursive(node.right, path, paths);
    }

}
