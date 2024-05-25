package org.example;

public class MaxArea {
    public static int maxArea(int[] height) {
        
        var maxArea = 0;
        
        for (int i = 0, j = height.length - 1; i < j; ) {
            var l = height[i];
            var r = height[j];
            var area = Math.min(l, r) * (j - i);
            
           maxArea = Math.max(maxArea, area);
            
            if (l < r) {
                i++;
            } else {
                j--;
            }
        }

        
        return maxArea;
    }
}
