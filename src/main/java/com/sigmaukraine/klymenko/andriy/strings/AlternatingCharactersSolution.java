package com.sigmaukraine.klymenko.andriy.strings;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings">Alternating Characters</a>
 */
public class AlternatingCharactersSolution {

    static int alternatingCharacters(String s) {

        int result = 0;
        char c = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if(c == s.charAt(i)) {
                result++;
            } else {
                c = s.charAt(i);
            }
        }

        return result;
    }
}
