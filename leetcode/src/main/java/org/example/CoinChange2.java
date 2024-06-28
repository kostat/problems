package org.example;

public class CoinChange2 {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (var i = 0; i < amount; i++) {
            int dpI = dp[i];
            if (dpI == 0)
                continue;

            for (var c : coins) {
                var n = i + c;
                if (n > amount)
                    continue;

                int dpN = dp[n];
                dp[n] = (dpN == 0) ?
                        dpI + 1 :
                        Math.min(dpN, dpI + 1);
            }
        }

        var ans = dp[amount];
        return (ans == 0) ? -1 : ans - 1;
    }
}
