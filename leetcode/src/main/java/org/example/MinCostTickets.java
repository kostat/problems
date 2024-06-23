package org.example;

import java.util.Arrays;

public class MinCostTickets {
    public int minCostTickets(int[] days, int[] costs) {

        var dp = new int[days.length + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (var i = 0; i < days.length; i++) {
            dp[i + 1] = Math.min(
                    dp[i] + costs[0], dp[i + 1]);

            var last7 = findLastIndex(days, i, 7);
            for (var j = i; j < last7; j++) {
                dp[j + 1] = Math.min(dp[j + 1], dp[i] + costs[1]);
            }

            var last30 = findLastIndex(days, i, 30);
            for (var j = i; j < last30; j++) {
                dp[j + 1] = Math.min(dp[j + 1], dp[i] + costs[2]);
            }

        }

        return dp[days.length];
    }

    int findLastIndex(int[] days, int i, int duration) {
        var day = days[i] + duration;
        for (var j = i + 1; j < days.length; j++) {
            if (days[j] >= day) {
                return j;
            }
        }
        return days.length;
    }
}
