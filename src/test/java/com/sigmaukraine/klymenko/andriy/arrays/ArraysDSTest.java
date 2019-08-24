package com.sigmaukraine.klymenko.andriy.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysDSTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1}}
        });
    }

    @ParameterizedTest(name = "input = {0}, expected = {1}")
    @DisplayName("Should return array with reversed order")
    @MethodSource("data")
    void countMinimumSwaps(int[] input, int[] expected) {
        assertArrayEquals(expected, ArraysDS.reverseArray(input));
    }
}
