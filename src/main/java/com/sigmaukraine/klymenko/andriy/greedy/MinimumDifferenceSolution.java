package com.sigmaukraine.klymenko.andriy.greedy;

import java.util.Arrays;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms">Minimum Absolute Difference in an Array</a>
 */
public class MinimumDifferenceSolution {

    static int minimumAbsoluteDifference(int[] arr) {
        int res = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < res) {
                res = diff;
            }
        }

        return res;
    }
}
