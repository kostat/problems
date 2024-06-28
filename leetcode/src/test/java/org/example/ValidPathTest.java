package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPathTest {

    @Test
    void validPath_singleNode() {
        assertTrue(new ValidPath().validPath(1, new int[][]{}, 0, 0));
    }

    @Test
    void validPath_twoNodesConnected() {
        assertTrue(new ValidPath().validPath(2, new int[][]{{0, 1}}, 0, 1));
    }

    @Test
    void validPath_twoNodesDisconnected() {
        assertFalse(new ValidPath().validPath(2, new int[][]{}, 0, 1));
    }

    @Test
    void validPath_multipleNodesConnected() {
        assertTrue(new ValidPath().validPath(3, new int[][]{{0, 1}, {1, 2}}, 0, 2));
    }

    @Test
    void validPath_multipleNodesDisconnected() {
        assertFalse(new ValidPath().validPath(3, new int[][]{{0, 1}}, 0, 2));
    }

    @Test
    void validPath_cycle() {
        assertTrue(new ValidPath().validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2));
    }

    @Test
    void validPath_largeInput() {
        assertTrue(new ValidPath().validPath(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}}, 0, 4));
    }
}
