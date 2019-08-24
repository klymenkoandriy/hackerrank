package com.sigmaukraine.klymenko.andriy.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SparseArraysSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {new String[]{"aba", "baba", "aba", "xzxb"},
                        new String[]{"aba", "xzxb", "ab"},
                        new int[]{2, 1, 0}}

        });
    }

    @ParameterizedTest(name = "input = {0}, queries = {1}, expected = {2}")
    @DisplayName("should return an array of integers representing the frequency of occurrence of each query string in strings")
    @MethodSource("data")
    void countMinimumSwaps(String[] input, String[] queries, int[] expected ) {
        assertArrayEquals(expected, SparseArraysSolution.matchingStrings(input, queries));
    }

}
