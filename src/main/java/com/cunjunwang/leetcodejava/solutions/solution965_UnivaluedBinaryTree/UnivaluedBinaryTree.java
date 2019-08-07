package com.cunjunwang.leetcodejava.solutions.solution965_UnivaluedBinaryTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class UnivaluedBinaryTree {

    /**
     * A binary tree is univalued if every node in
     * the tree has the same value.
     * Return true if and only if the given tree is univalued.
     * <p>
     * Example 1:
     * Input: [1,1,1,1,1,null,1]
     * Output: true
     * <p>
     * Example 2:
     * Input: [2,2,2,5,2]
     * Output: false
     *
     * @param root
     * @return
     */
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        int val = root.val;
        return isUnivalTreeRecursive(root, val);
    }

    private boolean isUnivalTreeRecursive(TreeNode node, int val) {
        if (node == null) {
            return true;
        }
        if (node.val != val) {
            return false;
        }
        return isUnivalTreeRecursive(node.left, val) && isUnivalTreeRecursive(node.right, val);
    }

    // level order traverse: TLE
//    public boolean isUnivalTree(TreeNode root) {
//        if (root == null) {
//            return false;
//        }
//        int val = root.val;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.remove();
//            if (node.val != val) {
//                return false;
//            }
//            if (node.left != null) {
//                queue.add(root.left);
//            }
//            if (node.right != null) {
//                queue.add(root.right);
//            }
//        }
//        return true;
//    }

}
