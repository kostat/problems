package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {

    @Test
    void fourSum_emptyArray() {
        assertEquals(Collections.emptyList(), new FourSum().fourSum(new int[]{}, 0));
    }

    @Test
    void fourSum_noSolution() {
        assertEquals(Collections.emptyList(), new FourSum().fourSum(new int[]{1, 2, 3, 4}, 100));
    }

    @Test
    void fourSum_singleSolution() {
        assertEquals(Arrays.asList(Arrays.asList(-1, 0, 1, 2)), new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 2));
    }

    @Test
    void fourSum_singleSolution1() {
        assertEquals(Arrays.asList(Arrays.asList(-5, -4, -3, 1)), new FourSum().fourSum(new int[]{1, -2, -5, -4, -3, 3, 3, 5}, -11));
    }

    @Test
    void fourSum_noSolutionBigNums() {
        assertEquals(Collections.emptyList(), new FourSum().fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));
    }

    @Test
    void fourSum_allZeros() {
        assertEquals(Arrays.asList(Arrays.asList(0, 0, 0, 0)), new FourSum().fourSum(new int[]{0, 0, 0, 0}, 0));
    }

    @Test
    void fourSum_multipleSolutions() {
        assertEquals(
                Arrays.asList(Arrays.asList(-3, -2, 2, 3),
                        Arrays.asList(-3, -1, 1, 3),
                        Arrays.asList(-3, 0, 0, 3),
                        Arrays.asList(-3, 0, 1, 2),
                        Arrays.asList(-2, -1, 0, 3),
                        Arrays.asList(-2, -1, 1, 2),
                        Arrays.asList(-2, 0, 0, 2),
                        Arrays.asList(-1, 0, 0, 1)),
                new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2, -3, 3}, 0));
    }

    @Test
    void fourSum_duplicateNumbers() {
        assertEquals(Arrays.asList(Arrays.asList(-2, 0, 2, 2),
                        Arrays.asList(-1, -1, 2, 2),
                        Arrays.asList(-1, 0, 1, 2)),
                new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2, -1, 2}, 2));
    }
}
