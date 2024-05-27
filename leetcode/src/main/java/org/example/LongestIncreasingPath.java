package org.example;

public class LongestIncreasingPath {
    public static int longestIncreasingPath(int[][] matrix) {
        var cache = new int[matrix.length * matrix[0].length];
        var result = 0;
        
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                result = Math.max(result, longestIncreasingPathAt(matrix, r, c, cache));
            }
        }
        
        return result;
    }

    static int longestIncreasingPathAt(int[][] matrix, int r, int c, int[] cache) {

        var val = matrix[r][c];
        
        var right = dfs(matrix, r, c + 1, val, cache);
        var left = dfs(matrix, r, c - 1, val, cache);
        var up = dfs(matrix, r - 1, c, val, cache);
        var down = dfs(matrix, r + 1, c, val, cache);
        
        var cur = Math.max(right, Math.max(left, Math.max(up, down))) + 1;
        cache[r * matrix[0].length + c] = cur;
        
        return cur;
    }
    
    private static int dfs(int[][] matrix, int r, int c, int from, int[] cache) {
       
        if (r < 0 || r >= matrix.length || c < 0 || c >= matrix[0].length) {
            return 0;
        }
        
        var val = matrix[r][c];
        if (from >= val) {
            return 0;
        }
        
        var cached = cache[r * matrix[0].length + c];
        if (cached != 0) {
            return cached;
        }
        
        return longestIncreasingPathAt(matrix, r, c, cache);
    }
}
