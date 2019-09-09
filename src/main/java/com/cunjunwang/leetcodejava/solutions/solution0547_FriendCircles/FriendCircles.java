package com.cunjunwang.leetcodejava.solutions.solution0547_FriendCircles;

import org.springframework.stereotype.Component;

import java.util.Stack;
import java.util.TreeSet;

/**
 * Created by CunjunWang on 2019-09-09.
 */
@Component
public class FriendCircles {

    int m, n;
    boolean[] visited;

    public int findCircleNum(int[][] M) {
        int count = 0;
        m = M.length;
        if (m == 0)
            return 0;
        n = M[0].length;
        if (n == 0)
            return 0;
        this.visited = new boolean[m];
        for (int i = 0; i < m; i++) {
            visited[i] = false;
        }
        TreeSet<Integer>[] graph = constructGraph(M);


        for (int i = 0; i < m; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, graph);
            }
        }

        return count;
    }

    private void dfs(int v, TreeSet<Integer>[] graph) {
        Stack<Integer> todo = new Stack<>();
        todo.push(v);
        visited[v] = true;
        while (!todo.isEmpty()) {
            int cur = todo.peek();
            todo.pop();
            TreeSet<Integer> adjs = graph[cur];
            for (int e : adjs) {
                if (!visited[e]) {
                    todo.push(e);
                    visited[e] = true;
                }
            }
        }
    }

    private TreeSet<Integer>[] constructGraph(int[][] M) {
        TreeSet<Integer>[] result = new TreeSet[m];
        for (int i = 0; i < m; i++) {
            TreeSet<Integer> set = new TreeSet<>();
            int[] data = M[i];
            for (int j = 0; j < n; j++) {
                if (j != i && data[j] == 1) {
                    set.add(j);
                }
            }
            result[i] = set;
        }
        return result;
    }

}
