package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring("aaa"));
        assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"));
        assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("dvdf"));
        assertEquals(2, LengthOfLongestSubstring.lengthOfLongestSubstring("abba"));
    }

    @Test
    void lengthOfLongestSubstring_allUniqueCharacters() {
        assertEquals(4, LengthOfLongestSubstring.lengthOfLongestSubstring("abcd"));
    }

    @Test
    void lengthOfLongestSubstring_allSameCharacters() {
        assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring("aaaaa"));
    }

    @Test
    void lengthOfLongestSubstring_emptyString() {
        assertEquals(0, LengthOfLongestSubstring.lengthOfLongestSubstring(""));
    }

    @Test
    void lengthOfLongestSubstring_singleCharacter() {
        assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring("a"));
    }

    @Test
    void lengthOfLongestSubstring_substringAtStart() {
        assertEquals(2, LengthOfLongestSubstring.lengthOfLongestSubstring("aab"));
    }

    @Test
    void lengthOfLongestSubstring_substringAtEnd() {
        assertEquals(2, LengthOfLongestSubstring.lengthOfLongestSubstring("baa"));
    }

    @Test
    void lengthOfLongestSubstring_substringInMiddle() {
        assertEquals(2, LengthOfLongestSubstring.lengthOfLongestSubstring("baab"));
    }
}
