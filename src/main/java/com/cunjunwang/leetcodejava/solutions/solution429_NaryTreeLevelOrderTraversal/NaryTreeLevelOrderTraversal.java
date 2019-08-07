package com.cunjunwang.leetcodejava.solutions.solution429_NaryTreeLevelOrderTraversal;

import com.cunjunwang.leetcodejava.solutions.CommonObject.NaryTree.Node;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class NaryTreeLevelOrderTraversal {

    /**
     * Given an n-ary tree, return the level order traversal of
     * its nodes' values. (ie, from left to right, level by level).
     * For example, given a 3-ary tree:
     * We should return its level order traversal:
     * [
     * [1],
     * [3,2,4],
     * [5,6]
     * ]
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> innerList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = queue.remove();
                innerList.add(node.val);
                if (node.children != null && !node.children.isEmpty()) {
                    queue.addAll(node.children);
                }
            }
            list.add(innerList);
        }
        return list;
    }

}
