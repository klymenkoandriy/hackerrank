package com.sigmaukraine.klymenko.andriy.dictionaries;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/count-triplets-1/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps">Count Triplets</a>
 */
public class CountTripletsSolution {

    static long countTriplets(List<Long> arr, long r) {
        Map<Long,Long> m1 = new HashMap<>();
        Map<Long,Long> m2 = new HashMap<>();
        long result = 0;

        for (long val : arr) {
            if (val % r == 0) {
                result += m2.getOrDefault(val / r, 0L);
                m2.put(val, m2.getOrDefault(val, 0L) + m1.getOrDefault(val / r, 0L));
            }
            m1.put(val, m1.getOrDefault(val, 0L) + 1);
        }
        return result;
    }
}
