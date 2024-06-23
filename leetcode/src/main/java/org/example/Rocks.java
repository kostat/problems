package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Rocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        var result = 0;
        var freeCaps = new ArrayList<Integer>();
        
        for (var i = 0; i < capacity.length; i++) {
            var freeCap = capacity[i] - rocks[i];
            
            if (freeCap <= 0) result++;
            else freeCaps.add(freeCap);
        }

        Collections.sort(freeCaps);
        
        for (var free : freeCaps) {
            additionalRocks -= free;

            if (additionalRocks >= 0) result ++;
            
            if (additionalRocks <= 0) break;
        }
        
        return result;
    }
}
