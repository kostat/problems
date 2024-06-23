package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathBinaryMatrixTest {

    @Test
    void shortestPathBinaryMatrix_singleStep() {
        assertEquals(2, new ShortestPathBinaryMatrix().shortestPathBinaryMatrix(new int[][]{{0, 0}, {0, 0}}));
    }

    @Test
    void shortestPathBinaryMatrix_multipleSteps() {
        assertEquals(3, new ShortestPathBinaryMatrix().shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}));
    }

    @Test
    void shortestPathBinaryMatrix_obstacleInPath() {
        assertEquals(-1, new ShortestPathBinaryMatrix().shortestPathBinaryMatrix(new int[][]{{0, 0}, {0, 1}}));
    }

    @Test
    void shortestPathBinaryMatrix_noPath() {
        assertEquals(-1, new ShortestPathBinaryMatrix().shortestPathBinaryMatrix(new int[][]{{0, 1}, {1, 1}}));
    }

    @Test
    void shortestPathBinaryMatrix_largeGrid() {
        assertEquals(5, new ShortestPathBinaryMatrix().shortestPathBinaryMatrix(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}}));
    }

    @Test
    void shortestPathBinaryMatrix_largeGrid1() {
        assertEquals(4, new ShortestPathBinaryMatrix().shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}));
    }
}
