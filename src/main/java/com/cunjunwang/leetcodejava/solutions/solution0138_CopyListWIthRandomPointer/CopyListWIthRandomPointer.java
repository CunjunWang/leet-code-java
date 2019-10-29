package com.cunjunwang.leetcodejava.solutions.solution0138_CopyListWIthRandomPointer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-10-29.
 */
public class CopyListWIthRandomPointer {

    class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {
        }

        public Node(int _val, Node _next, Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }

    public Node copyRandomList(Node head) {

        if (head == null)
            return head;

        // I will do a two pass solution.
        // In the first pass, I will just make a cope of all the nodes themself, with no references
        // In the second pass, I will the connect them.

        // The hashmap is used here to save the copy
        // I can fetch the copy with the original node in O(1) time.
        Map<Node, Node> record = new HashMap<>();

        // first pass, use a map to save the node and its copy.
        Node cur = head;
        while (cur != null) {
            Node copy = new Node(cur.val, null, null);
            record.put(cur, copy);
            cur = cur.next;
        }

        // second pass, set the pointers
        cur = head;
        while (cur != null) {
            Node copy = record.get(cur);

            copy.next = record.get(cur.next);
            copy.random = record.get(cur.random);

            cur = cur.next;
        }

        return record.get(head);
    }

}
