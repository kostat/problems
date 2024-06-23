package org.example;

import java.util.ArrayDeque;

public class ShortestPathBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {

        final var n = grid.length;
        var q = new ArrayDeque<int[]>();

        var length = 0;

        q.push(new int[]{0, 0});

        while (!q.isEmpty()) {

            length++;

            for (var size = q.size(); size > 0; size--) {
                var xy = q.removeLast();
                int x = xy[0], y = xy[1];
                if (grid[x][y] != 0) continue;

                if (x == y && x == n - 1) return length;
                
                grid[x][y] = 1;

                for (var i = -1; i <= 1; i++) {
                    for (var j = -1; j <= 1; j++) {
                        int nx = x + i, ny = y + j;
                        if (nx < 0 || nx >= n) continue;
                        if (ny < 0 || ny >= n) continue;
                        if (grid[nx][ny] != 0) continue;
                        
                        q.addFirst(new int[]{nx, ny});
                    }
                }

            }

        }

        return -1;
    }
}
