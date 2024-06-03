package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintHouseTest {
    
    @Test
    void minCost_singleHouse() {
        assertEquals(1, new PaintHouse().minCost(new int[][]{{1, 2, 3}}));
    }

    @Test
    void minCost_twoHouses() {
        assertEquals(3, new PaintHouse().minCost(new int[][]{{1, 2, 3}, {1, 2, 3}}));
    }

    @Test
    void minCost_multipleHouses() {
        assertEquals(13, new PaintHouse().minCost(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    void minCost_complexCase() {
        assertEquals(10, new PaintHouse().minCost(new int[][]{{17, 2, 17}, {16, 16, 5}, {14, 3, 19}}));
    }
}
