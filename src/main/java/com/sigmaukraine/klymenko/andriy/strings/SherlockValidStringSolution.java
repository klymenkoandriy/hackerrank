package com.sigmaukraine.klymenko.andriy.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings">Sherlock and the Valid String</a>
 */
public class SherlockValidStringSolution {

    static String isValid(String s) {
        Map<Character, Integer> chars = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            chars.put(s.charAt(i), chars.getOrDefault(s.charAt(i), 0) + 1);
        }

        Map<Integer, Integer> amount = new HashMap<>();

        for(int val : chars.values()) {
            amount.put(val, amount.getOrDefault(val, 0) + 1);
        }

        List<Integer> stat = new ArrayList<>(amount.keySet());
        Collections.sort(stat);

        boolean result = stat.size() <= 1
                || (stat.size() == 2
                    && ((stat.get(0) == 1 && amount.get(stat.get(0)) == 1)
                        || (stat.get(0) + 1 == stat.get(1) && amount.get(stat.get(1)) == 1)));

        return result ? "YES" : "NO";
    }
}
