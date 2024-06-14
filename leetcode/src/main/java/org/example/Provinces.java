package org.example;

public class Provinces {
    public int findCircleNum(int[][] isConnected) {
        var n = isConnected.length;
        var ds = new UnionFind(n);

        for (var i = 0; i < n; i++) {
            for (var j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    ds.union(i, j);
                }
            }
        }
        
        return ds.count();
    }
}
