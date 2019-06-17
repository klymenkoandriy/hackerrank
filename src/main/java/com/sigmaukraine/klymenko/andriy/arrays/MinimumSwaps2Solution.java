package com.sigmaukraine.klymenko.andriy.arrays;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays">Arrays: Minimum Swaps 2</a>
 */
public class MinimumSwaps2Solution {

    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[j] == i + 1) {
                        int buff = arr[i];
                        arr[i] = arr[j];
                        arr[j] = buff;
                        swaps++;
                        break;
                    }
                }
            }
        }
        return swaps;
    }
}
