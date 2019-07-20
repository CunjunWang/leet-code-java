package com.cunjunwang.leetcodejava.solutions.solution108_ConvertSortedArrayToBinarySearchTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-20.
 */
@Component
public class ConvertSortedArrayToBinarySearchTree {

    /**
     * Given an array where elements are sorted in ascending order,
     * convert it to a height balanced BST.
     * For this problem, a height-balanced binary tree is defined as a
     * binary tree in which the depth of the two subtrees of every node
     * never differ by more than 1.
     * <p>
     * Example:
     * Given the sorted array: [-10,-3,0,5,9],
     * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
     *       0
     *      / \
     *    -3   9
     *    /   /
     *  -10  5
     *
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return recursiveBuildTree(nums, 0, nums.length - 1);
    }

    private TreeNode recursiveBuildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = recursiveBuildTree(nums, left, mid - 1);
        root.right = recursiveBuildTree(nums, mid + 1, right);
        return root;
    }

}
