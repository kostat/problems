package org.example;

import java.util.Arrays;

public class MinimumAddedCoins {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);

        var sum = 0L;
        var ans = 0;
        for (var coin : coins) {
            while (coin > sum + 1) {
                ans++;
                sum += sum + 1;
            }
            sum += coin;
        }
        while (sum < target) {
            sum += sum + 1;
            ans++;
        }
        return ans;
    }
}
