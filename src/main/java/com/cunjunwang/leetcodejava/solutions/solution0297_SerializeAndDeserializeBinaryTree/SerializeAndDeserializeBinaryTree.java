package com.cunjunwang.leetcodejava.solutions.solution0297_SerializeAndDeserializeBinaryTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by CunjunWang on 2019-10-31.
 */
public class SerializeAndDeserializeBinaryTree {

    // O(n) time
    // O(n) space

    private static final String nil = "null";

    private static final String delimiter = " ";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        doSerialize(root, sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(delimiter);
        Queue<String> nodes = new LinkedList<>();
        for (String s : split) {
            nodes.offer(s.trim());
        }
        return doDeserialize(nodes);
    }

    private void doSerialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(nil).append(delimiter);
            return;
        }
        sb.append(root.val).append(delimiter);
        doSerialize(root.left, sb);
        doSerialize(root.right, sb);
    }

    private TreeNode doDeserialize(Queue<String> nodes) {
        if (nodes.isEmpty())
            return null;

        String val = nodes.remove();
        if (val.equals(nil)) {
            return null;
        } else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = doDeserialize(nodes);
            node.right = doDeserialize(nodes);
            return node;
        }
    }

}
