package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    @Test
    void coinChange_exactAmount() {
        assertEquals(3, new CoinChange().coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    void coinChange_noSolution() {
        assertEquals(-1, new CoinChange().coinChange(new int[]{2}, 3));
    }

    @Test
    void coinChange_zeroAmount() {
        assertEquals(0, new CoinChange().coinChange(new int[]{1}, 0));
    }

    @Test
    void coinChange_singleCoin() {
        assertEquals(1, new CoinChange().coinChange(new int[]{1}, 1));
    }

    @Test
    void coinChange_largeAmount() {
        assertEquals(3, new CoinChange().coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    void coinChange_largeAmount1() {
        assertEquals(20, new CoinChange().coinChange(new int[]{186, 419, 83, 408}, 6249));
    }
}
