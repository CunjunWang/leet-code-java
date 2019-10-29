package com.cunjunwang.leetcodejava.solutions.solution0261_GraphValidTree;

import java.util.*;

/**
 * Created by CunjunWang on 2019-10-29.
 */
public class GraphValidTree {

    private Map<Integer, List<Integer>> graph;

    private boolean[] visited;

    public boolean validTree(int n, int[][] edges) {
        // check two conditions:
        // 1. number of edges = number of vertices - 1
        // 2. only one connected component

        visited = new boolean[n];
        Arrays.fill(visited, false);

        // first, we build a graph
        graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            int v = edge[0];
            int w = edge[1];
            graph.get(v).add(w);
            graph.get(w).add(v);
        }

        int numberOfCC = 0;
        // then, do dfs to find number of connected components;
        for (int v = 0; v < n; v++) {
            if (!visited[v]) {
                numberOfCC++;
                dfs(v);
            }
        }

        int numberOfEdges = edges.length;

        return (numberOfEdges == n - 1) && (numberOfCC == 1);
    }

    private void dfs(int v) {
        visited[v] = true;
        List<Integer> adjs = graph.get(v);
        for (int w : adjs) {
            if (!visited[w]) {
                dfs(w);
            }
        }
    }
}
