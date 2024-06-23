package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtisticPhotographTest {

    @Test
    void getArtisticPhotographCount_noArtists() {
        assertEquals(0, new ArtisticPhotograph().getArtisticPhotographCount(5, "BBBBB", 2, 3));
    }

    @Test
    void getArtisticPhotographCount_singleArtist() {
        assertEquals(0, new ArtisticPhotograph().getArtisticPhotographCount(5, "BBABB", 2, 3));
    }

    @Test
    void getArtisticPhotographCount_multipleArtists() {
        assertEquals(1, new ArtisticPhotograph().getArtisticPhotographCount(7, "BBABPAB", 2, 3));
    }

    @Test
    void getArtisticPhotographCount_largeInput() {
        assertEquals(2, new ArtisticPhotograph().getArtisticPhotographCount(9, "BBABPABBP", 2, 3));
    }

    @Test
    void getArtisticPhotographCount_noPhotographers() {
        assertEquals(0, new ArtisticPhotograph().getArtisticPhotographCount(5, "AAAAA", 2, 3));
    }

    @Test
    void getArtisticPhotographCount_singlePhotographer() {
        assertEquals(0, new ArtisticPhotograph().getArtisticPhotographCount(5, "AAAAP", 2, 3));
    }

    @Test
    void getArtisticPhotographCount_multiplePhotographers() {
        assertEquals(3, new ArtisticPhotograph().getArtisticPhotographCount(7, "BAAAPPA", 2, 3));
    }

    @Test
    void getArtisticPhotographCount_largeInputWithPhotographers() {
        assertEquals(0, new ArtisticPhotograph().getArtisticPhotographCount(10, "AAAAPPAPAA", 2, 3));
    }

    @Test
    void getArtisticPhotographCount_largeInputWithPhotographers1() {
        assertEquals(0, new ArtisticPhotograph().getArtisticPhotographCount(10, "AAAAPPAPAA", 2, 3));
    }

    @Test
    void getArtisticPhotographCount_largeInputWithPhotographers2() {
        assertEquals(0, new ArtisticPhotograph().getArtisticPhotographCount(5, "APABA", 2, 3));
    }

    @Test
    void getArtisticPhotographCount_largeInputWithPhotographers3() {
        assertEquals(3, new ArtisticPhotograph().getArtisticPhotographCount(8, ".PBAAP.B", 1, 3));
    }
}
