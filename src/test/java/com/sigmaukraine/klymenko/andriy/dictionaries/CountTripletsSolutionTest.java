package com.sigmaukraine.klymenko.andriy.dictionaries;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTripletsSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {Arrays.asList(1L, 2L, 2L, 4L), 2, 2},
                {Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L), 3, 6},
                {Arrays.asList(1L, 5L, 5L, 25L, 125L), 5, 4},
                {Arrays.asList(
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L,
                        1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L
                ), 1, 161700},
        });
    }

    @ParameterizedTest(name = "input = {0}, ratio = {1}, expected result = {2}")
    @DisplayName("Should return the number of triplets forming a geometric progression for a given ratio")
    @MethodSource("data")
    void count(List<Long> input, long ratio, long expected) {
        assertEquals(expected, CountTripletsSolution.countTriplets(input, ratio));
    }
}
