package org.example;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (var i = 1; i <= amount; i++) {
            for (var coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];

//        if (amount == 0) return 0;
//        return coinChange(coins, amount, new int[amount]);
    }

    int coinChange(int[] coins, int amount, int[] dp) {

        for (var coin : coins) {
            if (coin > amount) continue;
            dp[coin - 1] = 1;
        }

        for (var i = 0; i < amount; i++) {
            if (dp[i] == 0) continue;
            for (var coin : coins) {
                var v = (long) i + coin;
                if (v >= amount) continue;
                var j = (int) v;
                if (dp[j] == 0) dp[j] = dp[i] + 1;
                else dp[j] = Math.min(dp[j], dp[i] + 1);
            }
        }

        return dp[amount - 1] == 0 ? -1 : dp[amount - 1];
    }
}
