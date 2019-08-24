package com.sigmaukraine.klymenko.andriy.arrays;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/arrays-ds/problem">Arrays-DS</a>
 */
public class ArraysDS {

    static int[] reverseArray(int[] a) {
        for(int i = 0; i < a.length / 2; i++) {
            int point = a.length - 1 - i;
            int buff = a[i];
            a[i] = a[point];
            a[point] = buff;
        }

        return a;
    }
}
