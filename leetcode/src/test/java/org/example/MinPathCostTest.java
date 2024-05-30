package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPathCostTest {

    @Test
    void minPathCost_t1() {
        int[][] grid = {{5,3},{4,0},{2,1}} ;
        int[][] moveCost = {{9,8},{1,5},{10,12},{18,6},{2,4},{14,3}};
        assertEquals(17, MinPathCost.minPathCost(grid, moveCost));
    }

    @Test
    void minPathCost_t2() {
        int[][] grid = {{5,1,2},{4,0,3}} ;
        int[][] moveCost = {{12,10,15},{20,23,8},{21,7,1},{8,1,13},{9,10,25},{5,3,2}};
        assertEquals(6, MinPathCost.minPathCost(grid, moveCost));
    }

}
