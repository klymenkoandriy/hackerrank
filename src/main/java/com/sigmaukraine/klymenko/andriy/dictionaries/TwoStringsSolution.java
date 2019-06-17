package com.sigmaukraine.klymenko.andriy.dictionaries;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps">Two Strings</a>
 */
public class TwoStringsSolution {

    /**
     * Faster then the following twoStringsSimple method because it searches for a char in a set with a maximum size of 26.
     */
    static String twoStrings(String s1, String s2) {
        Set<Character> charsSet1 = convertToSet(s1);
        Set<Character> charsSet2 = convertToSet(s2);

        for (char c : charsSet1) {
            if (charsSet2.contains(c)) {
                return "YES";
            }
        }

        return "NO";
    }

    private static Set<Character> convertToSet(String s) {
        return s.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());
    }

    static String twoStringsSimple(String s1, String s2) {
        for(int i = 0; i < s1.length(); i++) {
            if (s2.contains(s1.substring(i, i+1))) {
                return "YES";
            }
        }
        return "NO";
    }

}
