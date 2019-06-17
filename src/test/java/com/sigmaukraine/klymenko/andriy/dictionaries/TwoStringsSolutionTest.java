package com.sigmaukraine.klymenko.andriy.dictionaries;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoStringsSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {"abc", "abc", "YES"},
                {"abcA", "def", "NO"}
        });
    }

    @ParameterizedTest(name = "input 1 = {0}, input 2 = {1}, expected result = {2}")
    @DisplayName("Should return a string, either YES or NO based on whether the strings share a common substring (fast)")
    @MethodSource("data")
    void compareFast(String s1, String s2, String expected) {
        assertEquals(expected, TwoStringsSolution.twoStrings(s1, s2));
    }

    @ParameterizedTest(name = "input 1 = {0}, input 2 = {1}, expected result = {2}")
    @DisplayName("Should return a string, either YES or NO based on whether the strings share a common substring (simple)")
    @MethodSource("data")
    void compareSimple(String s1, String s2, String expected) {
        assertEquals(expected, TwoStringsSolution.twoStringsSimple(s1, s2));
    }

}
