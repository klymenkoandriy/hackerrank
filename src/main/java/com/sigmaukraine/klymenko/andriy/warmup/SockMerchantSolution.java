package com.sigmaukraine.klymenko.andriy.warmup;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup">SockMerchant</a>
 */
public class SockMerchantSolution {

    static int sockMerchant(int n, int[] ar) {

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] != 0 && ar[i] == ar[j]) {
                    result++;
                    ar[j] = 0;
                    break;
                }
            }
        }

        return result;
    }
}
