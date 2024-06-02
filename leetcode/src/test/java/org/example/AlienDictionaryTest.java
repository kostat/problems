package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienDictionaryTest {

    @Test
    void alienOrder_singleWord() {
        assertEquals("abc", new AlienDictionary().alienOrder(new String[]{"abc"}));
    }

    @Test
    void alienOrder_multipleWordsSameOrder() {
        assertEquals("adebc", new AlienDictionary().alienOrder(new String[]{"abc", "bcd", "cde"}));
    }

    @Test
    void alienOrder_multipleWordsDifferentOrder() {
        assertEquals("bac", new AlienDictionary().alienOrder(new String[]{"bac", "bca", "acb"}));
    }

    @Test
    void alienOrder_noCommonCharacters() {
        assertEquals("abcyzx", new AlienDictionary().alienOrder(new String[]{"abc", "xyz"}));
    }

//    @Test
//    void alienOrder_emptyArray() {
//        assertEquals("", new AlienDictionary().alienOrder(new String[]{}));
//    }

    @Test
    void alienOrder_singleCharacterWords() {
        assertEquals("abc", new AlienDictionary().alienOrder(new String[]{"a", "b", "c"}));
    }

    @Test
    void alienOrder_inconsistentOrder() {
        assertEquals("", new AlienDictionary().alienOrder(new String[]{"abc", "bca", "cab", "bac"}));
    }

    @Test
    void alienOrder_inconsistentOrder1() {
        assertEquals("", new AlienDictionary().alienOrder(new String[]{"z", "x", "z"}));
    }

    @Test
    void alienOrder_order1() {
        assertEquals("wertf", new AlienDictionary().alienOrder(new String[]{"wrt", "wrf", "er", "ett", "rftt"}));
    }

    @Test
    void isAlienSorted_true() {
        assertTrue(new AlienDictionary().isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }

    @Test
    void isAlienSorted_false() {
        assertFalse(new AlienDictionary().isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"));
    }
}
