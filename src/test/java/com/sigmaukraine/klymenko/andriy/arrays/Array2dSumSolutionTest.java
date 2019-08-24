package com.sigmaukraine.klymenko.andriy.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array2dSumSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {new int[][]{
                        {1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 0, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0}
                }, 19},
                {new int[][]{
                        {-1, -1, 0, -9, -2, -2},
                        {-2, -1, -6, -8, -2, -5},
                        {-1, -1, -1, -2, -3, -4},
                        {-1, -9, -2, -4, -4, -5},
                        {-7, -3, -3, -2, -9, -9},
                        {-1, -3, -1, -2, -4, -5}
                }, -6},
        });
    }

    @ParameterizedTest(name = "input = {0}, expected = {1}")
    @DisplayName("should return an integer, the maximum hourglass sum in the array")
    @MethodSource("data")
    void countMinimumSwaps(int[][] input, int expected ) {
        assertEquals(expected, Array2dSumSolution.hourglassSum(input));
    }
}
