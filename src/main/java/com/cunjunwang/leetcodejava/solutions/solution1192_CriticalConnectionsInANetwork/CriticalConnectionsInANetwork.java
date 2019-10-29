package com.cunjunwang.leetcodejava.solutions.solution1192_CriticalConnectionsInANetwork;

import java.util.*;

/**
 * Created by CunjunWang on 2019-10-29.
 */
public class CriticalConnectionsInANetwork {

    // the order of visiting vertices
    private int[] ord;

    // the lowest index of the vertex that this vertex can reach
    private int[] low;

    // keep track of the current order;
    private int count;

    // result
    private List<List<Integer>> result;

    // graph
    private Map<Integer, List<Integer>> graph;

    private boolean[] visited;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        // find bridge of a graph.

        // first, build the graph with map
        graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }


        for (List<Integer> connection : connections) {
            int v = connection.get(0);
            int w = connection.get(1);

            graph.get(v).add(w);
            graph.get(w).add(v);
        }

        ord = new int[n];
        low = new int[n];
        visited = new boolean[n];
        Arrays.fill(visited, false);
        result = new ArrayList<>();

        // next, do dfs to keep track of the ord and low data of each vertex
        for (int i = 0; i < n; i++) {
            if (!visited[i])
                dfs(i, i);
        }

        return result;
    }

    private void dfs(int v, int parent) {
        // visit this vertex
        visited[v] = true;
        ord[v] = count++;
        low[v] = ord[v];

        List<Integer> adjs = graph.get(v);
        for (int w : adjs) {
            if (!visited[w]) {
                dfs(w, v);
                low[v] = Math.min(low[w], low[v]);
                if (low[w] > ord[v]) {
                    List<Integer> bridge = new ArrayList<>();
                    bridge.add(v);
                    bridge.add(w);
                    result.add(bridge);
                }
            } else {
                if (w != parent) {
                    low[v] = Math.min(low[v], low[w]);
                }
            }
        }
    }

}
