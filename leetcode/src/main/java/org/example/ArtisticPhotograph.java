package org.example;

public class ArtisticPhotograph {

    public long getArtisticPhotographCount(int N, String C, int X, int Y) {
        // prepare artistic view
        int bEnd = 0, bStart = bEnd - (Y - X);
        int a = bEnd + X;
        int aStart = a + X, aEnd = a + Y;

        int bB = 0, bP = 0;
        int aB = 0, aP = 0;

        for (int i = bStart; i <= bEnd; i++) {
            if (i < 0) {
                continue;
            }

            char c = C.charAt(i);
            if (c == 'B') {
                bB++;
            } else if (c == 'P') {
                bP++;
            }
        }

        for (int i = aStart; i <= aEnd; i++) {
            if (i >= N) {
                continue;
            }

            char c = C.charAt(i);
            if (c == 'B') {
                aB++;
            } else if (c == 'P') {
                aP++;
            }
        }

        // initialize result
        long result = 0;

        if (a < N && C.charAt(a) == 'A') {
            result += (long)(bB * aP) + bP * aB;
        }

        // iterate over the rest of the string
        while (aStart < N) {
            if (bStart >= 0) {

                char c = C.charAt(bStart++);
                if (c == 'B') {
                    bB--;
                } else if (c == 'P') {
                    bP--;
                }
            } else {
                bStart++;
            }

            char c = C.charAt(++bEnd);
            if (c == 'B') {
                bB++;
            } else if (c == 'P') {
                bP++;
            }

            c = C.charAt(aStart++);
            if (c == 'B') {
                aB--;
            } else if (c == 'P') {
                aP--;
            }

            if (aEnd < N - 1) {
                c = C.charAt(++aEnd);
                if (c == 'B') {
                    aB++;
                } else if (c == 'P') {
                    aP++;
                }
            }

            if (C.charAt(++a) == 'A') {
                result += (long)(bB * aP) + bP * aB;
            }
        }

        return result;
    }

    public long getArtisticPhotographCount1(int N, String C, int X, int Y) {

        long result = 0L;

        for (int i = 0; i < N; i++) {
            if (C.charAt(i) == 'A') {
                result += calcArtisticPhotographCount(N, C, i, X, Y);
            }
        }

        return result;
    }

    static long calcArtisticPhotographCount(int N, String C, int a, int X, int Y) {
        int bStart = a - Y, bEnd = a - X;
        int aStart = a + X, aEnd = a + Y;
        int bB = 0, bP = 0;
        int aB = 0, aP = 0;

        for (int i = bStart; i <= bEnd; i++) {
            if (i < 0) {
                continue;
            }

            char c = C.charAt(i);
            if (c == 'B') {
                bB++;
            } else if (c == 'P') {
                bP++;
            }
        }

        if (bB == 0 && bP == 0) {
            return 0;
        }

        for (int i = aStart; i <= aEnd; i++) {
            if (i >= N) {
                continue;
            }

            char c = C.charAt(i);
            if (c == 'B') {
                aB++;
            } else if (c == 'P') {
                aP++;
            }
        }

        return (long) Math.min(bB, aP) + Math.min(bP, aB);
    }
}
