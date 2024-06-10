package org.example;

public class PaintFence {
    public int numWays(int n, int k) {

        int m1 = k * k, m2 = k;

        for (var i = 2; i <= n; i++) {
            var temp = (k - 1) * (m1 + m2);
            m2 = m1;
            m1 = temp;
        }
        
        return m2;
    }
}
