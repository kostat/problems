package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanFinishCoursesTest {

    @Test
    void canFinish_noPrerequisites() {
        int[][] prerequisites = {};
        assertTrue(new CanFinishCourses().canFinish(2, prerequisites));
    }

    @Test
    void canFinish_singlePrerequisite() {
        int[][] prerequisites = {{1, 0}};
        assertTrue(new CanFinishCourses().canFinish(2, prerequisites));
    }

    @Test
    void canFinish_singlePrerequisite1() {
        int[][] prerequisites = {{0, 1}};
        assertTrue(new CanFinishCourses().canFinish(2, prerequisites));
    }

    @Test
    void canFinish_multiplePrerequisites() {
        int[][] prerequisites = {{1, 0}, {2, 1}};
        assertTrue(new CanFinishCourses().canFinish(3, prerequisites));
    }

    @Test
    void canFinish_circularPrerequisites() {
        int[][] prerequisites = {{1, 0}, {0, 1}};
        assertFalse(new CanFinishCourses().canFinish(2, prerequisites));
    }

    @Test
    void canFinish_complexCase() {
        int[][] prerequisites = {{1, 0}, {2, 1}, {3, 2}, {1, 3}};
        assertFalse(new CanFinishCourses().canFinish(4, prerequisites));
    }
}
