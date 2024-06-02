package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountHousePlacementsTest {

    @Test
    void countHousePlacements_zero() {
        assertEquals(4, CountHousePlacements.countHousePlacements(1));
    }

    @Test
    void countHousePlacements_one() {
        assertEquals(9, CountHousePlacements.countHousePlacements(2));
    }

    @Test
    void countHousePlacements_two() {
        assertEquals(25, CountHousePlacements.countHousePlacements(3));
    }

    @Test
    void countHousePlacements_three() {
        assertEquals(64, CountHousePlacements.countHousePlacements(4));
    }

    @Test
    void countHousePlacements_largeNumber() {
        assertEquals(500478595, CountHousePlacements.countHousePlacements(1000));
    }
}
