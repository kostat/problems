package org.example;

import java.util.*;

public class ValidPath {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<Integer>[] edges1 = new List[n];
        var visited = new boolean[n];

        for (var p : edges) {
            var dests = edges1[p[0]];
            if (dests == null)
                dests = edges1[p[0]] = new ArrayList<>();
            dests.add(p[1]);

            dests = edges1[p[1]];
            if (dests == null)
                dests = edges1[p[1]] = new ArrayList<>();
            dests.add(p[0]);
        }

        var dfs = new ArrayDeque<Integer>();
        dfs.push(source);

        while (!dfs.isEmpty()) {
            var cur = dfs.pop();
            if (cur == destination) return true;
            if (visited[cur]) continue;
            visited[cur] = true;

            var e = edges1[cur];

            if (e == null) continue;
            dfs.addAll(e);
        }

        return false;
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        var n = graph.length;
        var visited = new boolean[n];

        var path = new ArrayDeque<Integer>();
        List<List<Integer>> result = new ArrayList<>();

        path.addLast(0);
        dfs(graph, visited, 0, n - 1, path, result);

        return result;
    }

    static boolean dfs(int[][] edges, boolean[] visited, int target, int destination,
                       Deque<Integer> path, List<List<Integer>> result) {

        if (target == destination) {
            result.add(new ArrayList<>(path));
            return true;
        }

        if (visited[target])
            return false;

        visited[target] = true;

        var edge = edges[target];

        if (edge == null)
            return false;

        boolean hasPath = false;
        for (var next : edge) {
            path.addLast(next);
            hasPath |= dfs(edges, visited, next, destination, path, result);
            path.removeLast();
        }

        if (hasPath)
            visited[target] = false;

        return hasPath;
    }
}
