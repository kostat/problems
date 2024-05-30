package org.example;

public class MinPathCost {
    public static int minPathCost(int[][] grid, int[][] moveCost) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];

        int cost = Integer.MAX_VALUE;
        for (int c = 0; c < cols; c++) {
            cost = Math.min(cost, dp[0][c] = grid[0][c]);
        }


        for (int r = 1; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                cost = Integer.MAX_VALUE;
                for (int from = 0; from < cols; from++) {
                    cost = Math.min(cost, dp[r - 1][from] + moveCost[grid[r - 1][from]][c]);
                }
                dp[r][c] = cost + grid[r][c];
            }
        }

        if (rows > 1) {
            cost = Integer.MAX_VALUE;
            for (int c = 0; c < cols; c++) {
                cost = Math.min(cost, dp[rows - 1][c]);
            }
        }

        return cost;
    }
}
