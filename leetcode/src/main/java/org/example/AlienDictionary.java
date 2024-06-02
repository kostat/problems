package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {

        int[] index = new int[26];

        IntStream.range(0, order.length()).forEach(i -> index[order.charAt(i) - 'a'] = i);

        for (var i = 0; i < words.length - 1; i++) {
            var word1 = words[i];
            var word2 = words[i + 1];

            var j = 0;
            var shortest = Math.min(word1.length(), word2.length());
            for (; j < shortest; j++) {
                var c1 = word1.charAt(j);
                var c2 = word2.charAt(j);

                if (c1 == c2) continue;
                if (index[c1 - 'a'] > index[c2 - 'a']) return false;

                break;
            }

            if (j == shortest && word1.length() > word2.length()) return false;
        }

        return true;
    }

    public String alienOrder(String[] words) {
        Map<Character, Integer> inDegree = new HashMap<>();
        Map<Character, StringBuilder> out = new HashMap<>();

        for (var i = 0; i < words.length - 1; ) {
            var word1 = words[i];
            var word2 = words[++i];

            var j = 0;
            var shortest = Math.min(word1.length(), word2.length());
            for (; j < shortest; j++) {
                var c1 = word1.charAt(j);
                var c2 = word2.charAt(j);
                if (c1 == c2) continue;
                out.compute(c1, (k, v) -> v == null ? new StringBuilder() : v).append(c2);
                inDegree.compute(c2, (k, v) -> v == null ? 1 : ++v);
                break;
            }

            if (j == shortest && word1.length() > word2.length()) {
                return "";
            }

            for (; j < word2.length(); j++) {
                inDegree.putIfAbsent(word2.charAt(j), 0);
            }
        }

        IntStream.range(0, words[0].length()).forEach(i -> inDegree.putIfAbsent(words[0].charAt(i), 0));

        Deque<Character> ready = inDegree.entrySet().stream()
                .filter(entry -> entry.getValue() == 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayDeque::new));

        StringBuilder result = new StringBuilder();
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
