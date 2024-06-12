package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostExpensiveItemTest {

    @Test
    void mostExpensiveItem_samePrimes() {
        assertEquals(3, new MostExpensiveItem().mostExpensiveItem(2, 2));
    }

    @Test
    void mostExpensiveItem_differentPrimes() {
        assertEquals(7, new MostExpensiveItem().mostExpensiveItem(3, 5));
    }

    @Test
    void mostExpensiveItem_differentPrimes1() {
        assertEquals(23, new MostExpensiveItem().mostExpensiveItem(7, 5));
    }

    @Test
    void mostExpensiveItem_largePrimes() {
        assertEquals(839, new MostExpensiveItem().mostExpensiveItem(31, 29));
    }

    @Test
    void mostExpensiveItem_onePrimeIsOne() {
        assertEquals(0, new MostExpensiveItem().mostExpensiveItem(1, 5));
    }

    @Test
    void mostExpensiveItem_bothPrimesAreOne() {
        assertEquals(0, new MostExpensiveItem().mostExpensiveItem(1, 1));
    }
}
