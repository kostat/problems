package org.example;

import javax.xml.stream.events.StartDocument;
import java.lang.reflect.Array;
import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        var dp = new int[nums.length];
        Arrays.fill(dp, -1);
        
        return rob(nums, 0, dp);
    }
    
    private static int rob(int[] nums, int start, int[] dp) {

        if (start >= nums.length) {
            return 0;
        }

        if (dp[start] != -1) {
            return dp[start];
        }

        var o1 = nums[start] + rob(nums, start + 2, dp);
        var o2 = rob(nums, start + 1, dp);

        return dp[start] = Math.max(o1, o2);
    }
}
