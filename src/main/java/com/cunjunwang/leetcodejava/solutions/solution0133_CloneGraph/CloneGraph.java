package com.cunjunwang.leetcodejava.solutions.solution0133_CloneGraph;

import java.util.*;

/**
 * Created by CunjunWang on 2019-10-29.
 */
public class CloneGraph {

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
        }

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    class Solution {

        private Map<Node, Node> record;

        public Node cloneGraph(Node node) {
            if (node == null) {
                return node;
            }

            // I will do a two pass solution.
            // In the first pass, I will save all nodes into a hashmap
            // In this way, I can get the copy of each node in O(1) time.
            // I will traverse the graph with bfs.
            // In the second pass, I will just connect the nodes.

            record = new HashMap<>();
            Set<Integer> visited = new HashSet<>();

            Stack<Node> todo = new Stack<>();
            todo.push(node);
            while (!todo.empty()) {
                Node cur = todo.pop();
                visited.add(cur.val);
                Node copy = new Node(cur.val, null);
                record.put(cur, copy);

                for (Node neighbor : cur.neighbors) {
                    if (!visited.contains(neighbor.val)) {
                        todo.push(neighbor);
                    }
                }
            }

            // second pass:
            visited = new HashSet<>();
            todo.push(node);
            while (!todo.empty()) {
                Node cur = todo.pop();
                visited.add(cur.val);
                Node copy = record.get(cur);
                List<Node> neis = new ArrayList<>();
                for (Node n : cur.neighbors) {
                    neis.add(record.get(n));
                }
                copy.neighbors = neis;

                for (Node neighbor : cur.neighbors) {
                    if (!visited.contains(neighbor.val)) {
                        todo.push(neighbor);
                    }
                }
            }

            return record.get(node);
        }
    }

}
