package com.sigmaukraine.klymenko.andriy.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IceCreamParlorSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {new int[]{1, 4, 5, 3, 2}, 4, "1 4"},
                {new int[]{2, 2, 4, 3}, 4, "1 2"},
                {new int[]{7, 2, 5, 4, 11}, 12, "1 3"}
        });
    }

    @ParameterizedTest(name = "cost = {0}, money = {1}, expected = \"{2}\"")
    @DisplayName("Should return indices of the two flavors.")
    @MethodSource("data")
    void countTriplets(int[] cost, int money, String expected) {
        assertEquals(expected, IceCreamParlorSolution.determine(cost, money));
    }
}
