package org.example;

public class CountHousePlacements {
    public static int countHousePlacements(int n) {
        var x = countHousePlacementsSeq(n);

        return (int) ((x * x) % MOD);
    }

    private static final int MOD = 1000000007;

    private static long countHousePlacementsSeq(int n) {
        long m2 = 1, m1 = 2;

        for (int i = 0; i < n; i++) {
            var temp = (m2 + m1) % MOD;
            m2 = m1;
            m1 = temp;
        }

        return m2;
    }

}
