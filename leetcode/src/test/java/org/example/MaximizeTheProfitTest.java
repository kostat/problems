package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaximizeTheProfitTest {

    @Test
    void maximizeTheProfit_singleOffer() {
        List<List<Integer>> offers = Arrays.asList(Arrays.asList(0, 0, 10));
        assertEquals(10, new MaximizeTheProfit().maximizeTheProfit(1, offers));
    }

    @Test
    void maximizeTheProfit_multipleOffersForSingleHouse() {
        List<List<Integer>> offers = Arrays.asList(Arrays.asList(0, 0, 10), Arrays.asList(0, 0, 20));
        assertEquals(20, new MaximizeTheProfit().maximizeTheProfit(1, offers));
    }

    @Test
    void maximizeTheProfit_multipleHousesSingleOffer() {
        List<List<Integer>> offers = Arrays.asList(Arrays.asList(0, 2, 10));
        assertEquals(10, new MaximizeTheProfit().maximizeTheProfit(3, offers));
    }

    @Test
    void maximizeTheProfit_multipleHousesMultipleOffers() {
        List<List<Integer>> offers = Arrays.asList(Arrays.asList(0, 1, 10), Arrays.asList(1, 2, 20));
        assertEquals(20, new MaximizeTheProfit().maximizeTheProfit(3, offers));
    }

    @Test
    void maximizeTheProfit_multipleHousesMultipleOffers1() {
        List<List<Integer>> offers = Arrays.asList(Arrays.asList(0, 0, 1), Arrays.asList(0, 2, 2), Arrays.asList(1, 3, 2));
        assertEquals(3, new MaximizeTheProfit().maximizeTheProfit(5, offers));
    }

    @Test
    void maximizeTheProfit_multipleHousesMultipleOffers2() {
        List<List<Integer>> offers = Arrays.asList(
                Arrays.asList(0, 6, 9),
                Arrays.asList(0, 10, 5),
                Arrays.asList(2, 4, 1),
                Arrays.asList(2, 6, 6),
                Arrays.asList(3, 8, 5),
                Arrays.asList(4, 5, 1),
                Arrays.asList(5, 5, 10),
                Arrays.asList(5, 10, 8),
                Arrays.asList(7, 11, 9),
                Arrays.asList(8, 11, 5)
                
        );
        assertEquals(20, new MaximizeTheProfit().maximizeTheProfit(15, offers));
    }

    @Test
    void maximizeTheProfit_noOffers() {
        List<List<Integer>> offers = Arrays.asList();
        assertEquals(0, new MaximizeTheProfit().maximizeTheProfit(3, offers));
    }

    @Test
    void maximizeTheProfit_offersDoNotCoverAllHouses() {
        List<List<Integer>> offers = Arrays.asList(Arrays.asList(0, 0, 10));
        assertEquals(10, new MaximizeTheProfit().maximizeTheProfit(3, offers));
    }
}
