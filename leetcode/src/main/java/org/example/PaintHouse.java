package org.example;

import java.util.stream.IntStream;

public class PaintHouse {
    public int minCost(int[][] costs) {

        var k = costs[0].length;
        int[][] dp = new int[costs.length][k];

        return IntStream.range(0, k).map(i -> minCost(costs, 0, i, k, dp)).min().orElseThrow();
    }

    private static int minCost(int[][] costs, int i, int color, int k, int[][] dp) {
        if (i == costs.length) {
            return 0;
        }

        if (dp[i][color] != 0) {
            return dp[i][color];
        }

        return dp[i][color] = costs[i][color] +
                IntStream.range(1, k)
                        .map(j -> minCost(costs, i + 1, (color + j) % k, k, dp))
                        .min().orElseThrow();
    }
}
