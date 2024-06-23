package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapTest {

//    @Test
//    void trap_emptyArray() {
//        assertEquals(0, Trap.trap(new int[]{}));
//    }

    @Test
    void trap_singleElementArray() {
        assertEquals(0, Trap.trap(new int[]{1}));
    }

    @Test
    void trap_twoElementArray() {
        assertEquals(0, Trap.trap(new int[]{1, 2}));
    }

    @Test
    void trap_noTrap() {
        assertEquals(0, Trap.trap(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void trap_singleTrap() {
        assertEquals(1, Trap.trap(new int[]{2, 1, 2}));
    }

    @Test
    void trap_multipleTraps() {
        assertEquals(7, Trap.trap(new int[]{3, 0, 2, 0, 4}));
    }

    @Test
    void trap_complexCase() {
        assertEquals(6, Trap.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
