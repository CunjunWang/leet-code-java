package com.cunjunwang.leetcodejava.solutions.solution114_FlattenBinaryTreeToLinkedList;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class FlattenBinaryTreeToLinkedList {

    /**
     * Given a binary tree, flatten it to a linked
     * list in-place.
     * <p>
     * For example, given the following tree:
     * 1
     * / \
     * 2   5
     * / \   \
     * 3   4   6
     * The flattened tree should look like:
     * 1
     * \
     * 2
     * \
     * 3
     * \
     * 4
     * \
     * 5
     * \
     * 6
     *
     * @param root
     */
    public void flatten(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        preOrder(root, nodes);
        if (nodes.isEmpty()) return;
        for (int i = 0; i < nodes.size() - 1; i++) {
            TreeNode node = nodes.get(i);
            node.left = null;
            node.right = nodes.get(i + 1);
        }
        TreeNode last = nodes.get(nodes.size() - 1);
        last.left = last.right = null;
    }

    private void preOrder(TreeNode node, List<TreeNode> nodes) {
        if (node == null) return;
        nodes.add(node);
        preOrder(node.left, nodes);
        preOrder(node.right, nodes);
    }

}
