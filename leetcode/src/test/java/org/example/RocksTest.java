package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RocksTest {

    @Test
    void maximumBags_allBagsFull() {
        assertEquals(3, new Rocks().maximumBags(new int[]{5, 5, 5}, new int[]{5, 5, 5}, 0));
    }

    @Test
    void maximumBags_someBagsFull() {
        assertEquals(1, new Rocks().maximumBags(new int[]{5, 5, 5}, new int[]{5, 0, 0}, 0));
    }

    @Test
    void maximumBags_noBagsFull() {
        assertEquals(0, new Rocks().maximumBags(new int[]{5, 5, 5}, new int[]{0, 0, 0}, 0));
    }

    @Test
    void maximumBags_fillWithAdditionalRocks() {
        assertEquals(3, new Rocks().maximumBags(new int[]{5, 5, 5}, new int[]{4, 4, 4}, 3));
    }

    @Test
    void maximumBags_fillWithAdditionalRocks1() {
        assertEquals(3, new Rocks().maximumBags(new int[]{2, 3, 4, 5}, new int[]{1, 2, 4, 4}, 2));
    }

    @Test
    void maximumBags_notEnoughAdditionalRocks() {
        assertEquals(2, new Rocks().maximumBags(new int[]{5, 5, 5}, new int[]{4, 4, 4}, 2));
    }
}
