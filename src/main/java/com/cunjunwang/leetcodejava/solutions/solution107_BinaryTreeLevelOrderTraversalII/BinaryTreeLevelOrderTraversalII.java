package com.cunjunwang.leetcodejava.solutions.solution107_BinaryTreeLevelOrderTraversalII;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by CunjunWang on 2019-07-20.
 */
@Component
public class BinaryTreeLevelOrderTraversalII {

    /**
     * Given a binary tree, return the bottom-up level order traversal
     * of its nodes' values. (ie, from left to right, level by level
     * from leaf to root).
     * <p>
     * For example:
     * Given binary tree [3,9,20,null,null,15,7],
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * return its bottom-up level order traversal as:
     * [
     * [15,7],
     * [9,20],
     * [3]
     * ]
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        buildLevelOrder(root, 0, map);
        Set<Integer> keySet = map.keySet();
        int size = keySet.size();
        for (int i = 0; i < size; i++) {
            result.add(i, map.get(size - i - 1));
        }
        return result;
    }

    private void buildLevelOrder(TreeNode root, Integer level, Map<Integer, List<Integer>> map) {
        if (root == null) {
            return;
        }
        List<Integer> levelList = map.get(level);
        if (levelList == null) {
            levelList = new ArrayList<>();
        }
        levelList.add(root.val);
        map.put(level, levelList);
        level = level + 1;
        buildLevelOrder(root.left, level, map);
        buildLevelOrder(root.right, level, map);
    }

}
