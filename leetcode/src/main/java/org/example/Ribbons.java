package org.example;

import java.util.Arrays;

public class Ribbons {
    public int maxLength(int[] ribbons, int k) {
        if (ribbons.length == 0) return 0;
        var maxLen = Arrays.stream(ribbons).max().getAsInt() + 1;

        var minLen = 1;

        while (minLen < maxLen) {
            var len = (minLen + maxLen) / 2;
            var feasible = feasible(ribbons, k, len);
            if (feasible)
                minLen = len + 1;
            else
                maxLen = len;
        }
        
        return minLen - 1;
    }

    static boolean feasible(int[] ribbons, int k, int len) {


        for (var r : ribbons) {
            k -= r / len;
            if (k <= 0)
                return true;
        }

        return false;
    }
}
