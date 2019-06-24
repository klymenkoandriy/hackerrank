package com.sigmaukraine.klymenko.andriy.search;

import java.util.Arrays;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/pairs/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=search">Pairs</a>
 */
public class PairsSolution {

    static int pairs(int k, int[] arr) {
        Arrays.sort(arr);
        int res = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (Arrays.binarySearch(arr, arr[i] + k) > 0) {
                res ++;
            }
        }

        return res;
    }

    static int pairsSlow(int k, int[] arr) {
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + k == arr[j]) {
                    res++;
                }
            }
        }

        return res;
    }

}
