package org.example;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsTest {

    @Test
    void letterCombinations_singleDigit() {
        assertEqual(Arrays.asList("a", "b", "c"), LetterCombinations.letterCombinations("2"));
    }

    @Test
    void letterCombinations_twoDigits() {
        assertEqual(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), LetterCombinations.letterCombinations("23"));
    }

    @Test
    void letterCombinations_emptyString() {
        assertEqual(Collections.emptyList(), LetterCombinations.letterCombinations(""));
    }

    static void assertEqual(List<String> expected, List<String> actual) {
        if (!expected.isEmpty())
            expected.sort(String::compareTo);
        if (!actual.isEmpty())
            actual.sort(String::compareTo);
        assertEquals(expected, actual);
    }

   /* @Test
    void letterCombinations_nonDigitCharacter() {
        assertThrows(NumberFormatException.class, () -> LetterCombinations.letterCombinations("a"));
    }

    @Test
    void letterCombinations_digitOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> LetterCombinations.letterCombinations("1"));
    }*/
}
