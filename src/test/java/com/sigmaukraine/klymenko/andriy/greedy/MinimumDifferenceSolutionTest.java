package com.sigmaukraine.klymenko.andriy.greedy;

import com.sigmaukraine.klymenko.andriy.arrays.MinimumSwaps2Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDifferenceSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {new int[]{1, -3, 71, 68, 17}, 3},
                {new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75}, 1}
        });
    }

    @ParameterizedTest(name = "input = {0}, expected result = {1}")
    @DisplayName("Should return an integer that represents the minimum absolute difference between any pair of elements.")
    @MethodSource("data")
    void countMinimumDiff(int[] input, int expectedSwaps) {
        assertEquals(expectedSwaps, MinimumDifferenceSolution.minimumAbsoluteDifference(input));
    }
}
