package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThreeSumClosestTest {

    @Test
    void threeSum_1() {
        int[] nums = {-1,2,1,-4};
        assertEquals(2, ThreeSumClosest.threeSumClosest(nums, 1));
    }

    @Test
    void threeSum_2() {
        int[] nums = {0,0,0};
        assertEquals(0, ThreeSumClosest.threeSumClosest(nums, 1));
    }
}
