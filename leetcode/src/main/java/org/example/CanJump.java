package org.example;

public class CanJump {
    public static int canJump2(int[] nums) {
        var cache = new int[nums.length];
        return canJump(nums, 0, cache);
    }

    static int canJump(int[] nums, int i, int[] cache) {

        if (i >= nums.length - 1) return 0;
        if (cache[i] != 0) return cache[i];

        var minJumps = Integer.MAX_VALUE;
        for (var j = nums[i]; j >= 1; j--) {
            
            var jumps = canJump(nums, i + j, cache);
            if (jumps < 0) continue;

            minJumps = Math.min(minJumps, jumps);
        }

        if (minJumps == Integer.MAX_VALUE) {
            return cache[i] = -1;
        }

        return cache[i] = minJumps + 1;
    }

    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        int lastIndex = nums.length - 1;

        for (int i = 0; i < lastIndex && maxReach >= i; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= lastIndex)
                return true;
        }

        return maxReach >= lastIndex;
    }
}
