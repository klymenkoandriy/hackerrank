package com.sigmaukraine.klymenko.andriy.sorting;

import java.util.Arrays;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting">Mark and Toys</a>
 */
public class MarkAndToysSolution {

    static int maximumToys(int[] prices, int k) {

        int amount = 0;
        Arrays.sort(prices);

        for (int price : prices) {
            if(price > k) {
                break;
            }

            amount++;
            k -= price;
        }

        return amount;
    }

}
