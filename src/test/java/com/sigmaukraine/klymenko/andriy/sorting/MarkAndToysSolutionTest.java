package com.sigmaukraine.klymenko.andriy.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarkAndToysSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {new int[]{1, 12, 5, 111, 200, 1000, 10}, 50, 4},
                {new int[]{3, 7, 2, 9, 4}, 15, 3}
        });
    }

    @ParameterizedTest(name = "prices = {0}, budget = {1}, expected = {2}")
    @DisplayName("Should return maximum number of purchased toys")
    @MethodSource("data")
    void calculateMaximumToys(int[] prices, int budget, int expected) {
        assertEquals(expected, MarkAndToysSolution.maximumToys(prices, budget));
    }
}
