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
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip same result
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) j++; // skip same result
                    while (j < k && nums[k] == nums[k - 1]) k--; // skip same result
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }
}
