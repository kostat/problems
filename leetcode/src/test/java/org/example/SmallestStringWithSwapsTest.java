package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SmallestStringWithSwapsTest {

    @Test
    void smallestStringWithSwaps_singleSwap() {
        assertEquals("abc", new SmallestStringWithSwaps().smallestStringWithSwaps("abc", Arrays.asList(Arrays.asList(0, 2))));
    }

    @Test
    void smallestStringWithSwaps_multipleSwaps() {
        assertEquals("abc", new SmallestStringWithSwaps().smallestStringWithSwaps("cba", Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2))));
    }

    @Test
    void smallestStringWithSwaps_noSwaps() {
        assertEquals("abc", new SmallestStringWithSwaps().smallestStringWithSwaps("abc", Collections.emptyList()));
    }

    @Test
    void smallestStringWithSwaps_largeInput() {
        assertEquals("cccabbaaa", new SmallestStringWithSwaps().smallestStringWithSwaps("cccbbaaaa",
                Arrays.asList(Arrays.asList(0, 1),
                        Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(4, 5), Arrays.asList(6, 7), Arrays.asList(7, 8))));
    }

    @Test
    void smallestStringWithSwaps_singleCharacter() {
        assertEquals("a", new SmallestStringWithSwaps().smallestStringWithSwaps("a", Collections.emptyList()));
    }

    @Test
    void smallestStringWithSwaps_ex1() {
        assertEquals("bacd", new SmallestStringWithSwaps().smallestStringWithSwaps("dcab", Arrays.asList(
                Arrays.asList(0, 3), Arrays.asList(1, 2))));
    }

    @Test
    void smallestStringWithSwaps_ex2() {
        assertEquals("abcd", new SmallestStringWithSwaps().smallestStringWithSwaps("dcab", Arrays.asList(
                Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2))));
    }
}
