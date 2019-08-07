package com.cunjunwang.leetcodejava.solutions.solution559_MaximumDepthOfNaryTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.NaryTree.Node;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by CunjunWang on 2019-08-07.
 */
@Component
public class MaximumDepthOfNaryTree {

    /**
     * Given a n-ary tree, find its maximum depth.
     * The maximum depth is the number of nodes along the
     * longest path from the root node down to the
     * farthest leaf node.
     * <p>
     * Note:
     * The depth of the tree is at most 1000.
     * The total number of nodes is at most 5000.
     *
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.remove();
                if (node.children != null && !node.children.isEmpty()) {
                    for (Node child : node.children) {
                        queue.add(child);
                    }
                }
            }
            depth++;
        }
        return depth;
    }

}
