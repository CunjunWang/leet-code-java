package com.cunjunwang.leetcodejava.solutions.solution0399_EvaluateDivision;

import java.util.*;

/**
 * Created by CunjunWang on 2019-09-21.
 */
public class EvaluateDivision {

    private Map<String, Map<String, Double>> graph;

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        if (equations.isEmpty() || values.length == 0 || equations.size() != values.length || equations.get(0).isEmpty())
            return null;
        graph = new HashMap<>();
        buildGraph(equations, values);

        double[] result = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            result[i] = getResult(queries.get(i), new HashSet<>());
        }

        return result;
    }

    private double getResult(List<String> query, Set<String> visited) {
        String head = query.get(0);
        String tail = query.get(1);

        if (!graph.containsKey(head)) {
            return -1.0;
        }

        if (graph.get(head).containsKey(tail)) {
            return graph.get(head).get(tail);
        }

        visited.add(head);
        Set<Map.Entry<String, Double>> neighbors = graph.get(head).entrySet();
        for (Map.Entry<String, Double> neighbor : neighbors) {
            if (!visited.contains(neighbor.getKey())) {
                List<String> nextQuery = new ArrayList<>();
                nextQuery.add(neighbor.getKey());
                nextQuery.add(tail);
                double productWeight = getResult(nextQuery, visited);
                if (productWeight != -1.0)
                    return neighbor.getValue() * productWeight;
            }
        }

        return -1;
    }

    private void buildGraph(List<List<String>> equations, double[] values) {
        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            double value = values[i];
            String head = equation.get(0);
            String tail = equation.get(1);
            graph.putIfAbsent(head, new HashMap<>());
            graph.get(head).put(tail, value);
            graph.putIfAbsent(tail, new HashMap<>());
            graph.get(tail).put(head, 1.0 / value);
        }
    }

}
