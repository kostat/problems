package org.example;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return List.of();
        }
        return letterCombinations(digits, 0);
    }

    static List<String> letterCombinations(String digits, int index) {
        if (index == digits.length()) {
            return List.of("");
        }

        var result = new ArrayList<String>();

        var digit = digits.charAt(index);

        var letters = switch (digit) {
            case '7' -> new char[]{'p', 'q', 'r', 's'};
            case '8' -> new char[]{'t', 'u', 'v'};
            case '9' -> new char[]{'w', 'x', 'y', 'z'};
            default -> {
                char first = (char) ((digit - '2') * 3 + 'a');
                yield new char[]{first, (char) (first + 1), (char) (first + 2)};
            }
        };

        for (var suffix : letterCombinations(digits, index + 1)) {
            for (var letter : letters) {
                result.add(letter + suffix);
            }
        }
        return result;

    }
}
