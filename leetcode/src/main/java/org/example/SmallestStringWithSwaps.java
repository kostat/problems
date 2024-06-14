package org.example;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmallestStringWithSwaps {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {

        var uf = new UF(s.length());
        for (var p : pairs)
            uf.union(p.get(0), p.get(1));

        Map<Integer, List<Integer>> components = new HashMap<>();
        for (var i = 0; i < s.length(); i++) {
            components.computeIfAbsent(uf.find(i) , k -> new ArrayList<>()).add(i);
        }
        
        var res = new char[s.length()];
        
        for (var comp : components.values()) {
            var indices = comp.toArray();
            comp.sort((l, r) -> s.charAt(l) - s.charAt(r));
            for (var i = 0; i < indices.length; i++)
                res[(Integer) indices[i]] = s.charAt(comp.get(i));
        }
        
        return new String(res);
    }
    
    class UF {
        
        int[] parent;
        int[] rank;
        int count;
        
        public UF(int n) {
            parent = new int[n];
            rank = new int[n];
            count  = n;
            
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }
        
        public int find(int x) {
            if (parent[x] == x) return x;
            
            return parent[x] = find(parent[x]);
        }
        
        public boolean union(int x, int y) {
            var rootX = find(x);
            var rootY = find(y);
            if (rootX == rootY) return false;
            
            if (rank[rootX] > rank[rootY])
                parent[rootY] = rootX;
            else if (rank[rootX] < rank[rootY])
                parent[rootX] = rootY;
            else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
            
            count--;
            return true;
        }
    }
}
