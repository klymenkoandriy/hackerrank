package com.sigmaukraine.klymenko.andriy.arrays;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/sparse-arrays/problem">Sparse Arrays</a>
 */
public class SparseArraysSolution {

    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result = new int[queries.length];

        for(int i = 0; i < queries.length; i++) {
            for(String input : strings){
                if(input.equals(queries[i])){
                    result[i] = result[i] + 1;
                }
            }
        }

        return result;
    }
}
