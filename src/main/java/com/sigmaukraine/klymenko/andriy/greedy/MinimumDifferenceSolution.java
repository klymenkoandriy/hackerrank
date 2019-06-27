package com.sigmaukraine.klymenko.andriy.greedy;

import java.util.Arrays;

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
