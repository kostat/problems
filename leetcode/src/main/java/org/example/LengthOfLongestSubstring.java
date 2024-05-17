package org.example;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> cache = new HashMap<>();
        int result = 0, start = 0;

        for (var i = 0; i < s.length(); i++) {

            var prev = cache.put(s.charAt(i), i);
            if (prev == null || prev < start) {
                continue;
            }
            
            result = Math.max(result, i - start);
            start = prev + 1;
        }

        return Math.max(result, s.length() - start);
    }
}
