package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonsTest {

    @Test
    void maxLength_exactDivision() {
        assertEquals(4, new Ribbons().maxLength(new int[]{4, 4, 4, 4}, 4));
    }

    @Test
    void maxLength_unevenDivision() {
        assertEquals(2, new Ribbons().maxLength(new int[]{4, 4, 4, 4}, 5));
    }

    @Test
    void maxLength_singleRibbon() {
        assertEquals(2, new Ribbons().maxLength(new int[]{2}, 1));
    }

    @Test
    void maxLength_zeroRibbons() {
        assertEquals(0, new Ribbons().maxLength(new int[]{}, 1));
    }

    @Test
    void maxLength_largeRibbons() {
        assertEquals(5, new Ribbons().maxLength(new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, 10));
    }
}
