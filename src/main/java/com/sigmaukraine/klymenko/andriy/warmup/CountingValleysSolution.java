package com.sigmaukraine.klymenko.andriy.warmup;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup">Counting Valleys</a>
 */
public class CountingValleysSolution {


    static int countingValleys(int n, String s) {

        int level = 0;
        int count = 0;

        for (char dir : s.toCharArray()) {
            switch (dir) {
                case 'U':
                    level++;
                    break;
                case 'D':
                    if (level-- == 0) {
                        count++;
                    }
                    break;
            }
        }

        return count;
    }

}
