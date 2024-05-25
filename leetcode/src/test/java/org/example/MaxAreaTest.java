package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAreaTest {

    @Test
    void maxArea_happyPath() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, MaxArea.maxArea(height));
    }

    @Test
    void maxArea_singleHeight() {
        int[] height = {1};
        assertEquals(0, MaxArea.maxArea(height));
    }

    @Test
    void maxArea_twoHeights() {
        int[] height = {1, 2};
        assertEquals(1, MaxArea.maxArea(height));
    }

    @Test
    void maxArea_descendingHeights() {
        int[] height = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(20, MaxArea.maxArea(height));
    }

    @Test
    void maxArea_ascendingHeights() {
        int[] height = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(20, MaxArea.maxArea(height));
    }

    @Test
    void maxArea_allSameHeight() {
        int[] height = {5, 5, 5, 5, 5, 5, 5, 5, 5};
        assertEquals(40, MaxArea.maxArea(height));
    }
}
