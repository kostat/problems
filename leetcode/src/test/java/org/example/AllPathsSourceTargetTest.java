package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class AllPathsSourceTargetTest {

    @Test
    void allPathsSourceTarget_singleNode() {
        assertEquals(Collections.singletonList(Collections.singletonList(0)), new ValidPath().allPathsSourceTarget(new int[][]{{}}));
    }

    @Test
    void allPathsSourceTarget_twoNodesConnected() {
        assertEquals(Collections.singletonList(Arrays.asList(0, 1)), new ValidPath().allPathsSourceTarget(new int[][]{{1}, {}}));
    }

    @Test
    void allPathsSourceTarget_multipleNodesConnected() {
        assertEquals(Arrays.asList(Arrays.asList(0, 1, 3), Arrays.asList(0, 2, 3)), new ValidPath().allPathsSourceTarget(new int[][]{{1, 2}, {3}, {3}, {}}));
    }

    @Test
    void allPathsSourceTarget_multiplePaths() {
        assertEquals(Arrays.asList(Arrays.asList(0, 1, 4), Arrays.asList(0, 2, 4), Arrays.asList(0, 3, 4), Arrays.asList(0, 4)), new ValidPath().allPathsSourceTarget(new int[][]{{1, 2, 3, 4}, {4}, {4}, {4}, {}}));
    }

    @Test
    void allPathsSourceTarget_multiplePaths1() {
        assertEquals(Arrays.asList(Arrays.asList(0, 4), Arrays.asList(0, 3, 4), Arrays.asList(0, 1, 3, 4), Arrays.asList(0, 1, 2, 3, 4), Arrays.asList(0, 1, 4)), new ValidPath().allPathsSourceTarget(new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}}));
    }

    @Test
    void allPathsSourceTarget_path() {
        assertEquals(Arrays.asList(Arrays.asList(0, 1, 2, 3)), new ValidPath().allPathsSourceTarget(new int[][]{{1}, {2}, {3}, {}}));
    }

    @Test
    void allPathsSourceTarget_noPath() {
        assertEquals(Collections.emptyList(), new ValidPath().allPathsSourceTarget(new int[][]{{1}, {}, {3}, {}}));
    }
}
