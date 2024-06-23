package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostTicketsTest {

    @Test
    void minCostTickets_singleDay() {
        assertEquals(2, new MinCostTickets().minCostTickets(new int[]{1}, new int[]{2, 7, 15}));
    }

    @Test
    void minCostTickets_multipleDays() {
        assertEquals(11, new MinCostTickets().minCostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15}));
    }

    @Test
    void minCostTickets_multipleDaysWithGap() {
        assertEquals(12, new MinCostTickets().minCostTickets(new int[]{1, 4, 6, 14, 15, 20}, new int[]{2, 7, 15}));
    }

    @Test
    void minCostTickets_singleDayWithHighCost() {
        assertEquals(15, new MinCostTickets().minCostTickets(new int[]{1}, new int[]{20, 25, 15}));
    }

    @Test
    void minCostTickets_noDays() {
        assertEquals(0, new MinCostTickets().minCostTickets(new int[]{}, new int[]{2, 7, 15}));
    }
}
