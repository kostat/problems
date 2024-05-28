package org.example;

import java.util.*;

class FourSum {
    public List<List<Integer>> fourSum1(int[] nums, int target) {
        var cache = new HashMap<Long, Integer[]>();
        Set<Integer[]> result = new TreeSet<>(Arrays::compare);

        for (int f = 0; f < nums.length; f++) {

            for (int i = f + 1; i < nums.length; i++) {

                for (int j = i + 1; j < nums.length; j++) {

                    var two = (long)nums[i] + nums[j];
                    var x = cache.get(two);
                    if (x == null || x[0] == i || x[0] == j || x[1] == i || x[1] == j)
                        continue;

                    Integer[] quad = {nums[x[0]], nums[x[1]], nums[i], nums[j]};
                    Arrays.sort(quad);
                    result.add(quad);
                }

                cache.put((long)target - ((long)nums[f] + nums[i]), new Integer[]{f, i});
            }
        }

        return result.stream().map(Arrays::asList).toList();
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        var fPrevVal = 0;
        for (var f = 0; f < nums.length - 3; f++) {

            var fVal = nums[f];
            if (f > 0 && fVal == fPrevVal) continue; // skip same result

            var iPrevVal = fPrevVal;
            for (int iStart = f + 1, i = iStart; i < nums.length - 2; i++) {
                var iVal = nums[i];
                if (i > iStart && iVal == iPrevVal) continue; // skip same result

                int l = i + 1, h = nums.length - 1;
                while (l < h) {
                    int lVal = nums[l], hVal = nums[h];
                    var sum = (long)fVal + iVal + lVal + hVal;
                    if (sum == target) {
                        result.add(Arrays.asList(fVal, iVal, lVal, hVal));
                        while (l < h && lVal == nums[++l]) ;// skip same result
                        while (l < h && hVal == nums[--h]) ;// skip same result
                    } else if (sum < target) {
                        l++;
                    } else {
                        h--;
                    }
                }

                iPrevVal = iVal;
            }

            fPrevVal = fVal;
        }
        return result;
    }
}
