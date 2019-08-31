package com.sigmaukraine.klymenko.andriy.dinamic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxArraySumSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {new int[]{3, 7, 4, 6, 5}, 13},
                {new int[]{2, 1, 5, 8, 4}, 11},
                {new int[]{3, 5, -7, 8, 10}, 15},
                {new int[]{-3, 5}, 5},
                {new int[]{3}, 3}
        });
    }

    @ParameterizedTest(name = "input = {0}, expected = {1}")
    @DisplayName("should return an integer representing the maximum subset sum for the given array")
    @MethodSource("data")
    void countMaxSubstSum(int[] input, int expected) {
        assertEquals(expected, MaxArraySumSolution.maxSubsetSum(input));
    }
}
