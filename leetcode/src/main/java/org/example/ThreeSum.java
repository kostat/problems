package org.example;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum1(int[] nums) {


        var cache = new HashMap<Integer, Integer>();
        Set<Integer[]> result = new TreeSet<>(Arrays::compare);

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                var two = nums[i] + nums[j];
                var x = cache.get(two);
                if (x == null)
                    continue;

                Integer[] triplet = {nums[x], nums[i], nums[j]};
                Arrays.sort(triplet);
                result.add(triplet);
            }

            cache.put(-nums[i], i);
        }

        return result.stream().map(Arrays::asList).toList();
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        var iPrevVal = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            var iVal = nums[i];
            if (iVal > 0) break; // if the first element is greater than zero, the sum will be greater than zero
            if (i > 0 && iVal == iPrevVal) continue; // skip same result
            
            int l = i + 1, h = nums.length - 1;
            while (l < h) {
                int lVal = nums[l], hVal = nums[h];
                var sum = (long)iVal + lVal + hVal;
                if (sum == 0) {
                    result.add(Arrays.asList(iVal, lVal, hVal));
                    while (l < h && lVal == nums[++l]);// skip same result
                    while (l < h && hVal == nums[--h]);// skip same result
                } else if (sum < 0) {
                    l++;
                } else {
                    h--;
                }
            }
            
            iPrevVal = iVal;
        }
        return result;
    }
}
