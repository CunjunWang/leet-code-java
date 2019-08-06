package com.cunjunwang.leetcodejava.solutions.solution590_NaryTreePostorderTraversal;

import com.cunjunwang.leetcodejava.solutions.CommonObject.NaryTree.Node;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CunjunWang on 2019-08-06.
 */
@Component
public class NaryTreePostorderTraversal {

    /**
     * Given an n-ary tree, return the postorder
     * traversal of its nodes' values.
     * Return its postorder traversal as: [5,6,3,2,4,1].
     * <p>
     * Note:
     * Recursive solution is trivial, could you do it
     * iteratively?
     *
     * @param root
     * @return
     */
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postOrderTraverse(root, result);
        return result;
    }

    private void postOrderTraverse(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        for (Node child : node.children) {
            postOrderTraverse(child, result);
        }
        result.add(node.val);
    }

}
