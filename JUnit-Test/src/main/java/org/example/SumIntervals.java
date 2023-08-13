package org.example;

import java.util.Arrays;

public class SumIntervals {
    public static int sumIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int sum = 0;
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                sum += end - start;
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        sum += end - start;
        return sum;
    }

    public static void main(String[] args) {
        /* Manual Tests */
        /* Output -> 4 (Tested) */
        int[][] firstIntervals = {{1, 5}};
        int firstResult = sumIntervals(firstIntervals);
        System.out.println("La somme des intervalles est : " + firstResult);

        /* Output -> 7 (Tested) */
        int[][] secondIntervals = {{1, 4}, {7, 10}, {3, 5}};
        int secondResult = sumIntervals(secondIntervals);
        System.out.println("La somme des intervalles est : " + secondResult);
    }
}
