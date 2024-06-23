package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintFenceTest {
    

    @Test
    void numWays_singleFence() {
        assertEquals(3, new PaintFence().numWays(1, 3));
    }

    @Test
    void numWays_twoFences() {
        assertEquals(9, new PaintFence().numWays(2, 3));
    }

    @Test
    void numWays_threeFences() {
        assertEquals(24, new PaintFence().numWays(3, 3));
    }

    @Test
    void numWays_threeFences2() {
        assertEquals(6, new PaintFence().numWays(3, 2));
    }

    @Test
    void numWays_multipleFences() {
        assertEquals(66, new PaintFence().numWays(4, 3));
    }

    @Test
    void numWays_sevenFences() {
        assertEquals(42, new PaintFence().numWays(7, 2));
    }

    @Test
    void numWays_zeroColors() {
        assertEquals(0, new PaintFence().numWays(3, 0));
    }

    @Test
    void numWays_singleColor() {
        assertEquals(0, new PaintFence().numWays(3, 1));
    }

    @Test
    void numWays_largeInput() {
        assertEquals(652460032, new PaintFence().numWays(30, 7));
    }
}
