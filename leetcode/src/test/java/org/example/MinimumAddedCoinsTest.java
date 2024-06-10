package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAddedCoinsTest {

    @Test
    void minimumAddedCoins_emptyArray() {
        assertEquals(1, new MinimumAddedCoins().minimumAddedCoins(new int[]{}, 1));
    }

    @Test
    void minimumAddedCoins_singleCoin() {
        assertEquals(0, new MinimumAddedCoins().minimumAddedCoins(new int[]{1}, 1));
    }

    @Test
    void minimumAddedCoins_multipleCoins() {
        assertEquals(1, new MinimumAddedCoins().minimumAddedCoins(new int[]{1, 2, 5}, 11));
    }

    @Test
    void minimumAddedCoins_largeTarget() {
        assertEquals(4, new MinimumAddedCoins().minimumAddedCoins(new int[]{1, 2, 5}, 100));
    }

    @Test
    void minimumAddedCoins_largeTarget1() {
        assertEquals(3, new MinimumAddedCoins().minimumAddedCoins(new int[]{1, 1, 1}, 20));
    }

    @Test
    void minimumAddedCoins_largeTarget2() {
        assertEquals(2, new MinimumAddedCoins().minimumAddedCoins(new int[]{1, 4, 10}, 19));
    }

    @Test
    void minimumAddedCoins_largeCoins() {
        assertEquals(8, new MinimumAddedCoins().minimumAddedCoins(new int[]{100, 200, 500}, 1000));
    }

    @Test
    void minimumAddedCoins_unsortedCoins() {
        assertEquals(1, new MinimumAddedCoins().minimumAddedCoins(new int[]{5, 2, 1}, 11));
    }
}
