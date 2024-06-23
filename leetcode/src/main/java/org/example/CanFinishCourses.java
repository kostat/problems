package org.example;

import java.util.*;

public class CanFinishCourses {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Deque<Integer> ready = new ArrayDeque<>();
        var inDegree = new int[numCourses];
        var outDegree = new HashMap<Integer, List<Integer>>();

        for (var i = 0; i < prerequisites.length; i++) {
            var course = prerequisites[i][0];
            var prerequisite = prerequisites[i][1];

            inDegree[course]++;
            outDegree.compute(prerequisite, (k, v) -> v == null ? new ArrayList<>() : v).add(course);
        }

        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0)
                ready.add(i);
        }

        var count = 0;

        while (!ready.isEmpty()) {
            var course = ready.poll();
            count++;

            outDegree.getOrDefault(course, List.of())
                    .forEach(nextCourse -> {
                        if (--inDegree[nextCourse] == 0) {
                            ready.add(nextCourse);
                        }
                    });
        }

        return count == numCourses;
    }

    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        // Adding elements to the sorted map 
        sortedMap.put("A", 1);
        sortedMap.put("C", 3);
        sortedMap.put("B", 2);

        // Getting values from the sorted map 
        int valueA = sortedMap.get("A");
        System.out.println("Value of A: " + valueA);

        // Removing elements from the sorted map 
        sortedMap.remove("B");

        // Iterating over the elements of the sorted map 
        for (String key : sortedMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + sortedMap.get(key));
        }
    }
}
