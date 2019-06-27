package com.sigmaukraine.klymenko.andriy.search;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/triple-sum/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search">Triple sum</a>
 */
public class TripleSumSolution {

    static long triplets(int[] a, int[] b, int[] c) {
        int result = 0;

        a = convert(a);
        b = convert(b);
        c = convert(c);

        for (int valB : b) {
            result += count(a, valB) * count(c, valB);
        }

        return result;
    }

    // and remove duplicates and sort
    private static int[] convert(int[] arr) {
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        int[] res = set.stream().mapToInt(i -> i).toArray();
        Arrays.sort(res);
        return  res;
    }

    private static int count(int[] arr, int val) {
        for (int search = val; search > 0; search--) {
            int index = Arrays.binarySearch(arr, search);
            if (index >= 0) {
                return index + 1;
            }
        }

        return 0;
    }
}
