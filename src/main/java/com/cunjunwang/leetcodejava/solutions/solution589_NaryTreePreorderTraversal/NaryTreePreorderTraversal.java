package com.cunjunwang.leetcodejava.solutions.solution589_NaryTreePreorderTraversal;

import com.cunjunwang.leetcodejava.solutions.CommonObject.NaryTree.Node;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-08-06.
 */
@Component
public class NaryTreePreorderTraversal {

    /**
     * Given an n-ary tree, return the preorder traversal
     * of its nodes' values.
     * Return its preorder traversal as: [1,3,5,6,2,4].
     * <p>
     * Note:
     * Recursive solution is trivial, could you do it iteratively?
     *
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        preOrderNary(root, result);
        return result;
    }

    private void preOrderNary(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        for (Node child : node.children) {
            preOrderNary(child, result);
        }
    }

}
