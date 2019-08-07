package com.cunjunwang.leetcodejava.solutions.solution897_IncreasingOrderSearchTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class IncreasingOrderSearchTree {

    /**
     * Given a binary search tree, rearrange the tree in in-order
     * so that the leftmost node in the tree is now the root of the
     * tree, and every node has no left child and only 1 right child.
     * <p>
     * Example 1:
     * Input: [5,3,6,2,4,null,8,1,null,null,null,7,9]
     * Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
     * <p>
     * Note:
     * The number of nodes in the given tree will be between 1 and 100.
     * Each node will have a unique integer value from 0 to 1000.
     *
     * @param root
     * @return
     */
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        inOrder(root, nodes);
        if (nodes.isEmpty()) return null;
        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).left = null;
            nodes.get(i).right = nodes.get(i + 1);
        }
        nodes.get(nodes.size() - 1).left = nodes.get(nodes.size() - 1).right = null;
        return nodes.get(0);
    }

    private void inOrder(TreeNode node, List<TreeNode> nodes) {
        if (node == null) {
            return;
        }
        inOrder(node.left, nodes);
        nodes.add(node);
        inOrder(node.right, nodes);
    }

}
