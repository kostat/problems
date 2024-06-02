package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanJumpTest {

    @Test
    void canJump_singleJumpToEnd() {
        assertTrue(CanJump.canJump(new int[]{2, 0, 0}));
    }

    @Test
    void canJump_multipleJumpsToEnd() {
        assertTrue(CanJump.canJump(new int[]{2, 3, 0, 1, 0}));
    }

    @Test
    void canJump_cannotReachEnd() {
        assertFalse(CanJump.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    void canJump_singleElementArray() {
        assertTrue(CanJump.canJump(new int[]{0}));
    }

    @Test
    void canJump2_singleJumpToEnd() {
        assertEquals(1, CanJump.canJump2(new int[]{2, 0, 0}));
    }

    @Test
    void canJump2_multipleJumpsToEnd() {
        assertEquals(2, CanJump.canJump2(new int[]{2, 3, 0, 1, 0}));
    }

    @Test
    void canJump2_cannotReachEnd() {
        assertEquals(-1, CanJump.canJump2(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    void canJump2_singleElementArray() {
        assertEquals(0, CanJump.canJump2(new int[]{0}));
    }
}
