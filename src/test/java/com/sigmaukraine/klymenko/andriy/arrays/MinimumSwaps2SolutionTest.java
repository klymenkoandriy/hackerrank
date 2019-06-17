package com.sigmaukraine.klymenko.andriy.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSwaps2SolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {new int[]{2, 3, 4, 1, 5}, 3},
                {new int[]{1, 3, 5, 2, 4, 6, 7}, 3},
                {new int[]{3, 7, 6, 9, 1, 8, 10, 4, 2, 5}, 9}
        });
    }

    @ParameterizedTest(name = "input = {0}, expected minimum swaps = {1}")
    @DisplayName("Should return minimum swaps to sort array")
    @MethodSource("data")
    void countMinimumSwaps(int[] input, int expectedSwaps) {
        assertEquals(expectedSwaps, MinimumSwaps2Solution.minimumSwaps(input));
    }
}
