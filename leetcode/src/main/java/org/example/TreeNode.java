package org.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode fromArray(Integer[] flattenedLevels) {
        if (flattenedLevels == null || flattenedLevels.length == 0) {
            return null;
        }

        // Index to keep track of processed elements in the flattened array
        int index = 0;

        // Create the root node from the first element
        TreeNode root = new TreeNode(flattenedLevels[index++]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty() && index < flattenedLevels.length - 1) {
            TreeNode curr = queue.poll();
            var leftVal = flattenedLevels[index++];
            var rightVal = flattenedLevels[index++];
            if (leftVal != null) {
                var left = curr.left = new TreeNode(leftVal);
                queue.add(left);
            }
            if (rightVal != null) {
                var right = curr.right = new TreeNode(rightVal);
                queue.add(right);
            }
        }

        return root;
    }
}
