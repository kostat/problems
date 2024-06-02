package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @Test
    void rob_emptyArray() {
        assertEquals(0, new HouseRobber().rob(new int[]{}));
    }

    @Test
    void rob_singleElementArray() {
        assertEquals(1, new HouseRobber().rob(new int[]{1}));
    }

    @Test
    void rob_twoElementArray() {
        assertEquals(2, new HouseRobber().rob(new int[]{1, 2}));
    }

    @Test
    void rob_noRobbing() {
        assertEquals(0, new HouseRobber().rob(new int[]{0, 0, 0, 0, 0}));
    }

    @Test
    void rob_singleRobbing() {
        assertEquals(1, new HouseRobber().rob(new int[]{1, 0, 0, 0, 0}));
    }

    @Test
    void rob_multipleRobbing() {
        assertEquals(4, new HouseRobber().rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void rob_complexCase() {
        assertEquals(12, new HouseRobber().rob(new int[]{2, 7, 9, 3, 1}));
    }
}
