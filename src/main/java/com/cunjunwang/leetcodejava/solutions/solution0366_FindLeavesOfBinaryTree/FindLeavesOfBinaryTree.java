package com.cunjunwang.leetcodejava.solutions.solution0366_FindLeavesOfBinaryTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-10-28.
 */
@Component
public class FindLeavesOfBinaryTree {

    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        while (root != null) {
            List<Integer> curRes = new ArrayList<>();

            root = dfs(root, curRes);

            res.add(curRes);
        }

        return res;
    }

    public TreeNode dfs(TreeNode root, List<Integer> res) {
        if (root == null)
            return null;

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left == null && right == null) {
            res.add(root.val);
            return null;
        }

        root.left = dfs(left, res);
        root.right = dfs(right, res);

        return root;
    }

}
