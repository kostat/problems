package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    @Test
    void maximumUnits_singleBoxType() {
        assertEquals(20, new Truck().maximumUnits(new int[][]{{4, 5}}, 4));
    }

    @Test
    void maximumUnits_multipleBoxTypes() {
        assertEquals(57, new Truck().maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}}, 6));
    }

    @Test
    void maximumUnits_multipleBoxTypes1() {
        assertEquals(91, new Truck().maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
    }

    @Test
    void maximumUnits_truckSizeExceedsBoxes() {
        assertEquals(88, new Truck().maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}}, 20));
    }

    @Test
    void maximumUnits_zeroTruckSize() {
        assertEquals(0, new Truck().maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}}, 0));
    }

    @Test
    void maximumUnits_noBoxTypes() {
        assertEquals(0, new Truck().maximumUnits(new int[][]{}, 10));
    }
}
