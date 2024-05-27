package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinWindowTest {

    @Test
    void minWindow_happyPath() {
        assertEquals("BANC", MinWindow.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void minWindow_noValidWindow() {
        assertEquals("", MinWindow.minWindow("ADOBECODEBANC", "XYZ"));
    }

    @Test
    void minWindow_singleCharacterTarget() {
        assertEquals("B", MinWindow.minWindow("ADOBECODEBANC", "B"));
    }

    @Test
    void minWindow_targetSameAsSource() {
        assertEquals("ADOBECODEBANC", MinWindow.minWindow("ADOBECODEBANC", "ADOBECODEBANC"));
    }

    @Test
    void minWindow_targetLargerThanSource() {
        assertEquals("", MinWindow.minWindow("ABC", "ADOBECODEBANC"));
    }

    @Test
    void minWindow_multipleValidWindows() {
        assertEquals("AFBC", MinWindow.minWindow("ADEKAFBCDEBANC", "ABC"));
    }
}
