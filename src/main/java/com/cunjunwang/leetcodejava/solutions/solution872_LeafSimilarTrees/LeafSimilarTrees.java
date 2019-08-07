package com.cunjunwang.leetcodejava.solutions.solution872_LeafSimilarTrees;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class LeafSimilarTrees {

    /**
     * Consider all the leaves of a binary tree.
     * From left to right order, the values of those leaves
     * form a leaf value sequence.
     * Two binary trees are considered leaf-similar if their
     * leaf value sequence is the same.
     * Return true if and only if the two given trees with head
     * nodes root1 and root2 are leaf-similar.
     *
     * @param root1
     * @param root2
     * @return
     */
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        dfs(root1, leaves1);
        dfs(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    private void dfs(TreeNode node, List<Integer> leaves) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
        }
        dfs(node.left, leaves);
        dfs(node.right, leaves);
    }

}
