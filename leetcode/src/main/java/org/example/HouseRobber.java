package org.example;

import javax.xml.stream.events.StartDocument;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class HouseRobber {
    public int rob(int[] nums) {
        var dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return rob(nums, 0, nums.length, dp);
    }

    public int rob2(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        var dp = new int[nums.length];
        Arrays.fill(dp, -1);

        var o1 = rob(nums, 0, nums.length - 1, dp);

        Arrays.fill(dp, -1);
        var o2 = rob(nums, 1, nums.length, dp);

        return Math.max(o1, o2);
    }

    private static int rob(int[] nums, int start, int end, int[] dp) {

        if (start >= end) {
            return 0;
        }

        if (dp[start] != -1) {
            return dp[start];
        }

        var o1 = nums[start] + rob(nums, start + 2, end, dp);
        var o2 = rob(nums, start + 1, end, dp);

        return dp[start] = Math.max(o1, o2);
    }

    public int robBinary(TreeNode root) {
        Map<TreeNode, Integer> dp = new java.util.HashMap<>();
        return robBinary(root, dp);
    }

    static int robBinary(TreeNode root, Map<TreeNode, Integer> dp) {
        if (root == null) {
            return 0;
        }

        var cached = dp.get(root);
        if (cached != null)
            return cached;

        cached = Math.max(
                root.val + robChildren(root.left, dp) + robChildren(root.right, dp),
                robBinary(root.left, dp) + robBinary(root.right, dp));

        dp.put(root, cached);
        return cached;
    }

    static int robChildren(TreeNode root, Map<TreeNode, Integer> dp) {
        if (root == null) {
            return 0;
        }

        return robBinary(root.left, dp) + robBinary(root.right, dp);
    }
}
