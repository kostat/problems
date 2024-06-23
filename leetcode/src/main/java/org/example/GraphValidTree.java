package org.example;

public class GraphValidTree {
    public boolean validTree(int n, int[][] edges) {
        
        var uf = new UF(n);
        for (var edge : edges) {
            if (!uf.union(edge[0], edge[1])) {
                return false;
            }
        }

        return uf.count() == 1;
    }
    
    class UF {
        int[] parent;
        int[] rank;
        int count;
        
        public UF(int n) {
            parent = new int[n];
            rank = new int[n];
            count = n;
            for (var i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }
        
        public int find(int x) {
            if (x == parent[x]) return x;
            
            return parent[x] = find(parent[x]);
        }
        
        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) return false;

            if (rank[rootX] > rank[rootY])
                parent[rootY] = rootX;
            else if (rank[rootX] < rank[rootY])
                parent[rootX] = rootY;
            else {
                parent[rootX] = rootY;
                rank[rootY]++;
            }
            
            count--;
            return true;
        }
        
        public int count() {
            return count;
        }
    }
}
