package org.example;

import java.util.Arrays;

public class Truck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (l, r) -> r[1] - l[1]);
        
        var result = 0;
        for (var i = 0; i < boxTypes.length && truckSize > 0; i++) {
            var boxType = boxTypes[i];
            
            var load = Math.min(truckSize, boxType[0]);
            result += load * boxType[1];
            
            truckSize -= load;
        }
        
        return result;
    }
}
