package com.sigmaukraine.klymenko.andriy.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairsSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {new int[]{4, 2, 6, 8}, 1, 0},
                {new int[]{4, 2, 3, 1}, 1, 3},
                {new int[]{1, 5, 3, 4, 2,}, 2, 3},
                {new int[]{1, 3, 5, 8, 6, 4, 2}, 2, 5}
        });
    }

    @ParameterizedTest(name = "input = {0}, target = {1}, expected = {2}")
    @DisplayName("Should return number of pairs of input elements that have a difference equal to a target value.")
    @MethodSource("data")
    void countPairs(int[] input, int target, int expected) {
        assertEquals(expected, PairsSolution.pairs(target, input));
    }

    @ParameterizedTest(name = "input = {0}, target = {1}, expected = {2}")
    @DisplayName("Should return number of pairs of input elements that have a difference equal to a target value.")
    @MethodSource("data")
    void countPairsSlow(int[] input, int target, int expected) {
        assertEquals(expected, PairsSolution.pairsSlow(target, input));
    }

    // Linear Search takes 100 - 200 times longer then Binary Search for an array size of 10_000.
    @Test
    void compareVelocity() {
        int[] input = new int[10000];
        int target = 2;

        for (int i = 0; i < input.length; i++) {
            input[i] = i * target;
        }

        int expected = input.length - 1;

        //test methods
        countPairs(input, target, expected);
        countPairsSlow(input, target, expected);

        //compare time
        long time1 = System.nanoTime();
        PairsSolution.pairs(target, input);
        time1 = System.nanoTime() - time1;

        long time2 = System.nanoTime();
        PairsSolution.pairsSlow(target, input);
        time2 = System.nanoTime() - time2;

        System.out.println("time1= " + time1);
        System.out.println("time2= " + time2);
        System.out.println("rate= " + time2 / time1);
    }

}
