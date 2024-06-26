package org.example;

import java.util.*;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        int result = 0;
        long minDiff = Long.MAX_VALUE;
        Arrays.sort(nums);
        var iPrevVal = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            var iVal = nums[i];
            if (i > 0 && iVal == iPrevVal) continue; // skip same result
            
            int l = i + 1, h = nums.length - 1;
            while (l < h) {
                int lVal = nums[l], hVal = nums[h];
                var sum = (long)iVal + lVal + hVal;
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    l++;
                } else {
                    h--;
                }

                var diff = Math.abs(sum - target);
                if (diff < minDiff) {
                    minDiff = diff;
                    result = (int)sum;
                }
            }
            
            iPrevVal = iVal;
        }
        return result;
    }
}
