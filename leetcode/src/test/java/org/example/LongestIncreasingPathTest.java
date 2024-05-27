package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingPathTest {

    @Test
    void longestIncreasingPath_singleElementMatrix() {
        int[][] matrix = {{1}};
        assertEquals(1, LongestIncreasingPath.longestIncreasingPath(matrix));
    }

    @Test
    void longestIncreasingPath_twoElementMatrix() {
        int[][] matrix = {{1, 2}};
        assertEquals(2, LongestIncreasingPath.longestIncreasingPath(matrix));
    }

    @Test
    void longestIncreasingPath_descendingElements() {
        int[][] matrix = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        assertEquals(5, LongestIncreasingPath.longestIncreasingPath(matrix));
    }

    @Test
    void longestIncreasingPath_ascendingElements() {
        int[][] matrix = {{1, 2, 3}, {6, 5, 4}, {7, 8, 9}};
        assertEquals(9, LongestIncreasingPath.longestIncreasingPath(matrix));
    }

    @Test
    void longestIncreasingPath_allSameElements() {
        int[][] matrix = {{5, 5, 5}, {5, 5, 5}, {5, 5, 5}};
        assertEquals(1, LongestIncreasingPath.longestIncreasingPath(matrix));
    }

    @Test
    void longestIncreasingPath_complexMatrix() {
        int[][] matrix = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        assertEquals(4, LongestIncreasingPath.longestIncreasingPath(matrix));
    }
}
