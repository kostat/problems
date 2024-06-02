package org.example;

import java.util.*;

public class AlienDictionary {

    public String alienOrder(String[] words) {
        Map<Character, Integer> inDegree = new HashMap<>();
        Map<Character, StringBuilder> out = new HashMap<>();
        Deque<Character> ready = new ArrayDeque<>();

        StringBuilder result = new StringBuilder();

        var first = words[0].charAt(0);
        ready.add(first);
        inDegree.put(first, 0);

        for (String word : words) {
            var newFirst = word.charAt(0);
            if (first != newFirst) {
                out.compute(first, (k, v) -> v == null ? new StringBuilder() : v).append(newFirst);
                inDegree.compute(newFirst, (k, v) -> v == null ? 1 : ++v);
                first = newFirst;
            }
            for (var i = 0; i < word.length() - 1; ) {
                var c1 = word.charAt(i);
                var c2 = word.charAt(++i);
                if (c1 == c2) continue;
                out.compute(c1, (k, v) -> v == null ? new StringBuilder() : v).append(c2);
                inDegree.compute(c2, (k, v) -> v == null ? 1 : ++v);
            }
        }

        while (!ready.isEmpty()) {
            var c = ready.poll();
            result.append(c);
            var sb = out.get(c);
            if (sb == null) continue;
            for (var i = 0; i < sb.length(); i++) {
                var next = sb.charAt(i);
                inDegree.compute(next, (k, v) -> {
                    if (--v == 0) ready.add(next);
                    return v;
                });
            }
        }

        if (result.length() != inDegree.size()) {
            return "";
        }

        return result.toString();
    }
}
