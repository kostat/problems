package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphValidTreeTest {

    @Test
    void validTree_singleNode() {
        assertTrue(new GraphValidTree().validTree(1, new int[][]{}));
    }

    @Test
    void validTree_twoNodesConnected() {
        assertTrue(new GraphValidTree().validTree(2, new int[][]{{0, 1}}));
    }

    @Test
    void validTree_twoNodesDisconnected() {
        assertFalse(new GraphValidTree().validTree(2, new int[][]{}));
    }

    @Test
    void validTree_multipleNodesConnected() {
        assertTrue(new GraphValidTree().validTree(3, new int[][]{{0, 1}, {1, 2}}));
    }

    @Test
    void validTree_multipleNodesDisconnected() {
        assertFalse(new GraphValidTree().validTree(3, new int[][]{{0, 1}}));
    }

    @Test
    void validTree_cycle() {
        assertFalse(new GraphValidTree().validTree(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}));
    }

    @Test
    void validTree_largeInput() {
        assertTrue(new GraphValidTree().validTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}}));
    }

    @Test
    void validTree_largeInputCycle() {
        assertFalse(new GraphValidTree().validTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}}));
    }
}
