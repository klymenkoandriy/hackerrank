package com.sigmaukraine.klymenko.andriy.warmup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysLefRotationSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {new int[]{0, 1, 2, 3, 4}, 3, new int[]{3, 4, 0, 1, 2}},
                {new int[]{41, 73, 89, 7, 10, 1, 59, 58, 84, 77}, 8, new int[]{84, 77, 41, 73, 89, 7, 10, 1, 59, 58}},
                {new int[]{41, 73, 89, 7, 10, 1, 59, 58, 84, 77}, 3, new int[]{7, 10, 1, 59, 58, 84, 77, 41, 73, 89,}},
                {new int[]{41, 73, 89, 7, 10, 1, 59, 58, 84, 77}, 13, new int[]{7, 10, 1, 59, 58, 84, 77, 41, 73, 89,}}
        });
    }

    @ParameterizedTest(name = "input = {0}, rotations = {1}, expected result = {2}")
    @DisplayName("Should perform left rotation")
    @MethodSource("data")
    void rotate(int[] input, int rotations, int[] expected) {
        assertArrayEquals(expected, ArraysLefRotationSolution.rotLeft(input, rotations));
    }

    @ParameterizedTest(name = "input = {0}, rotations = {1}, expected result = {2}")
    @DisplayName("Should perform left rotation")
    @MethodSource("data")
    void rotateMemorySafe(int[] input, int rotations, int[] expected) {
        assertArrayEquals(expected, ArraysLefRotationSolution.rotLeftMemorySafe(input, rotations));
    }

    @ParameterizedTest(name = "input = {0}, rotations = {1}, expected result = {2}")
    @DisplayName("Should perform left rotation")
    @MethodSource("data")
    void rotateShift(int[] input, int rotations, int[] expected) {
        assertArrayEquals(expected, ArraysLefRotationSolution.rotLeftShift(input, rotations));
    }

}
