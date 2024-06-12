package org.example;

public class MostExpensiveItem {
    public int mostExpensiveItem(int primeOne, int primeTwo) {
        var max = primeOne * primeTwo;
        var dp = new Boolean[max];
        /*dp[primeOne - 1] = true;
        dp[primeTwo - 1] = true;
        for (var i = max - 1; i >= 0; i--) {
            if (!canBuy(primeOne, primeTwo, i, dp))
                return i + 1;
        }*/
        
        // return p1 * p2 - p1 - p2

        for (var i = 0; i <= primeTwo; i++) {
            for (var j = 0; j <= primeOne; j++) {

                int price = i * primeOne + j * primeTwo - 1;
                if (price < 0)
                    continue;
                if (price >= max)
                    break;
                dp[price] = true;
            }
        }

        for (var i = max - 1; i >= 0; i--) {
            if (dp[i] == null)
                return i + 1;
        }

        return 0;
    }

    static boolean canBuy(int primeOne, int primeTwo, int price, Boolean[] dp) {
        if (price < 0) return false;
        if (dp[price] != null) return dp[price];

        return dp[price] = canBuy(primeOne, primeTwo, price - primeOne, dp) ||
                canBuy(primeOne, primeTwo, price - primeTwo, dp);
    }
}
