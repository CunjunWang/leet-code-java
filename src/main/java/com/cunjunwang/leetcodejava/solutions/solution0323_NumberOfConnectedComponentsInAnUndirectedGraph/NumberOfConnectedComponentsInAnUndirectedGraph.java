package com.cunjunwang.leetcodejava.solutions.solution0323_NumberOfConnectedComponentsInAnUndirectedGraph;

import java.util.*;

/**
 * Created by CunjunWang on 2019-10-29.
 */
public class NumberOfConnectedComponentsInAnUndirectedGraph {

    public int countComponents(int n, int[][] edges) {

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        // first, build the graph
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            int v = edge[0], w = edge[1];
            List<Integer> adjsV = graph.get(v);
            adjsV.add(w);
            graph.put(v, adjsV);

            List<Integer> adjsW = graph.get(w);
            adjsW.add(v);
            graph.put(w, adjsW);
        }

        int result = 0;

        Set<Integer> visited = new HashSet<>();

        // do dfs
        for (Integer i : graph.keySet()) {
            if (!visited.contains(i)) {
                result++;
                dfs(i, visited, graph);
            }
        }

        return result;
    }

    private void dfs(int v, Set<Integer> visited, Map<Integer, List<Integer>> graph) {
        List<Integer> adjs = graph.get(v);
        if (adjs != null) {
            for (int vertex : adjs) {
                if (!visited.contains(vertex)) {
                    visited.add(vertex);
                    dfs(vertex, visited, graph);
                }
            }
        }
    }

}
