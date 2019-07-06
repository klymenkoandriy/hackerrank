package com.sigmaukraine.klymenko.andriy.greedy;

import java.util.Arrays;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/greedy-florist/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms">Greedy Florist</a>
 */
public class GreedyFloristSolution {

    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int sum = 0;

        for(int i = c.length - 1; i >= 0; i--) {
            int factor = 1 + (c.length - i - 1) / k;
            sum += c[i] * factor;
        }

        return sum;
    }

}
