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
}
