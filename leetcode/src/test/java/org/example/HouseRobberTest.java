package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @Test
    void rob_emptyArray() {
        assertEquals(0, new HouseRobber().rob(new int[]{}));
    }

    @Test
    void rob_singleElementArray() {
        assertEquals(1, new HouseRobber().rob(new int[]{1}));
    }

    @Test
    void rob_twoElementArray() {
        assertEquals(2, new HouseRobber().rob(new int[]{1, 2}));
    }

    @Test
    void rob_noRobbing() {
        assertEquals(0, new HouseRobber().rob(new int[]{0, 0, 0, 0, 0}));
    }

    @Test
    void rob_singleRobbing() {
        assertEquals(1, new HouseRobber().rob(new int[]{1, 0, 0, 0, 0}));
    }

    @Test
    void rob_multipleRobbing() {
        assertEquals(4, new HouseRobber().rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void rob_complexCase() {
        assertEquals(12, new HouseRobber().rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    void rob2_circularArray() {
        assertEquals(3, new HouseRobber().rob2(new int[]{2, 3, 2}));
    }

    @Test
    void rob2_circularArrayComplex() {
        assertEquals(4, new HouseRobber().rob2(new int[]{1, 2, 3, 1}));
    }
    

    @Test
    void robBinary_singleNodeTree() {
        assertEquals(1, new HouseRobber().robBinary(new TreeNode(1)));
    }

    @Test
    void robBinary_twoNodeTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertEquals(2, new HouseRobber().robBinary(root));
    }

    @Test
    void robBinary_threeNodeTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(5, new HouseRobber().robBinary(root));
    }

    @Test
    void robBinary_complexTree() {
        TreeNode root = TreeNode.fromArray(new Integer[]{3, 2, 3, null, 3, null, 1});
        assertEquals(7, new HouseRobber().robBinary(root));
    }

    @Test
    void robBinary_complexTree1() {
        TreeNode root = TreeNode.fromArray(new Integer[]{3, 4, 5, 1, 3, null, 1});
        assertEquals(9, new HouseRobber().robBinary(root));
    }
}
