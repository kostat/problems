package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void threeSum_emptyArray() {
        int[] nums = {};
        assertTrue(ThreeSum.threeSum(nums).isEmpty());
    }

    @Test
    void threeSum_noTriplets() {
        int[] nums = {1, 2, 3};
        assertTrue(ThreeSum.threeSum(nums).isEmpty());
    }

    @Test
    void threeSum_singleTriplet() {
        int[] nums = {-1, 0, 1};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, 0, 1));
        assertEquals(expected, ThreeSum.threeSum(nums));
    }

    @Test
    void threeSum_multipleTriplets() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected, ThreeSum.threeSum(nums));
    }

    @Test
    void threeSum_duplicateTriplets() {
        int[] nums = {-1, 0, 1, -1, 0, 1};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected, ThreeSum.threeSum(nums));
    }
}
