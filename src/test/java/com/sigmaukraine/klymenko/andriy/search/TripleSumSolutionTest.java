package com.sigmaukraine.klymenko.andriy.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripleSumSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {new int[]{3, 5, 7}, new int[]{3, 6}, new int[]{4, 6, 9}, 4},
                {new int[]{1, 4, 5}, new int[]{2, 3, 3}, new int[]{1, 2, 3}, 5},
                {new int[]{1, 3, 5, 7}, new int[]{5, 7, 9}, new int[]{7, 9, 11, 13}, 12}
        });
    }

    @ParameterizedTest(name = "input A = {0}, input B = {1}, input C = {2}, expected = {3}")
    @DisplayName("Should return the number of distinct triplets.")
    @MethodSource("data")
    void countTriplets(int[] inputA, int[] inputB, int[] inputC,int expected) {
        assertEquals(expected, TripleSumSolution.triplets(inputA, inputB, inputC));
    }
}
