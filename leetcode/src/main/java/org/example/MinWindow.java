package org.example;

import java.util.HashMap;

public class MinWindow {
    public static String minWindow(String s, String t) {

        if (t.isEmpty() || s.length() < t.length()) {
            return "";
        }

        var chars = new HashMap<Character, Integer>();
        for (var i = 0; i < t.length(); i++) {

            var c = t.charAt(i);
            chars.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }

        var found = new HashMap<Character, Integer>();
        int start = 0, end = 0, counter = 0, minStart = 0, minLen = Integer.MAX_VALUE;

        while (end < s.length()) {

            // find window
            for (; end < s.length() && counter < t.length(); end++) {
                var c = s.charAt(end);
                var req = chars.get(c);
                if (req == null) {
                    continue;
                }
                var n = found.compute(c, (k, v) -> v == null ? 1 : v + 1);
                if (n <= req) {
                    counter++;
                }
            }

            if (counter < t.length()) {
                break;
            }

            // shrink window
            for (; ; ) {
                var c = s.charAt(start++);
                var req = chars.get(c);
                if (req == null) {
                    continue;
                }

                var n = found.compute(c, (k, v) -> v - 1);
                if (n < req) {
                    counter--;
                    break;
                }
            }

            var len = end - start + 1;
            if (len < minLen) {
                minStart = start - 1;
                minLen = len;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minStart, minStart + minLen);
    }
}
