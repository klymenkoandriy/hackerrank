package com.sigmaukraine.klymenko.andriy.warmup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SockMerchantSolutionTest {

    static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}},
                {6, new int[]{6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5}}
        });
    }

    @ParameterizedTest(name = "socks = {1}, expected pairs = {0}")
    @DisplayName("Should calculate the number of matching pairs")
    @MethodSource("data")
    void addition2(int expected, int[] data) {
        assertEquals(expected, SockMerchantSolution.sockMerchant(data.length, data));
    }
}
