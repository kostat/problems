package org.example;

import java.util.Comparator;
import java.util.List;

public class MaximizeTheProfit {
    public int maximizeTheProfit(int n, List<List<Integer>> offers) {
        // Sort offers by starting house index for efficient processing
        offers.sort(Comparator.comparingInt(o -> o.get(1)));

        // dp[i] represents the maximum gold earned considering offers ending up to index i (exclusive)
        int[] dp = new int[n + 1];
        
        for (int i = 0, j = 0; i < n; i++) {
            // Consider the best offer for the previous house
            var bestOffer = dp[i];
            for (; j < offers.size(); j++) {
                var offer = offers.get(j);
                if (offer.get(1) > i) break;
                // Check if the offer applies to the current house
                if (offer.get(1) == i) {
                    // Update bestOffer if the current offer provides more gold
                    bestOffer = Math.max(bestOffer, dp[offer.get(0)] + offer.get(2));
                }
            }
            // Set dp[i + 1] to the maximum gold earned considering previous houses and current best offer
            dp[i + 1] = bestOffer;
        }

        // Return the maximum gold earned for all houses
        return dp[n];
    }
}
