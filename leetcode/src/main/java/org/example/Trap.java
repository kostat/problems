package org.example;

public class Trap {
    public static int trap(int[] height) {
        int[] dp = new int[height.length];
        
        for (int i = 1; i < height.length; i++) {
            dp[i] = Math.max(dp[i - 1], height[i - 1]);
        }
        
        dp[dp.length - 1] = 0;
        var result = 0;
        
        for (int i = height.length - 2; i > 0; i--) {
            dp[i] = Math.min(dp[i], Math.max(dp[i + 1], height[i + 1]));
            result += Math.max(0, dp[i] - height[i]);
        }
        
        return result;
    }

    public int trap1(int[] height) {
        int l = 0, r = height.length - 1, maxL = 0, maxR = 0, res = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                if (maxL > height[l])
                    res += maxL - height[l];
                else
                    maxL = height[l];
                l++;
            } else {
                if (maxR > height[r])
                    res += maxR - height[r];
                else
                    maxR = height[r];

                r--;
            }
        }

        return res;
    }
}
