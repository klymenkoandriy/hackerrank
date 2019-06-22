package com.sigmaukraine.klymenko.andriy.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SherlockValidStringSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {"a", "YES"},
                {"abcc", "YES"},
                {"abcdefghhgfedecba", "YES"},
                {"aabbcd", "NO"},
                {"aaabbbbac", "YES"},
                {"aaaabbcc", "NO"},
                {"aabbccddeefghi", "NO"}
        });
    }

    @ParameterizedTest(name = "input = {0}, expected result = {1}")
    @DisplayName("Should validate input string.")
    @MethodSource("data")
    void validate(String input, String expected) {
        assertEquals(expected, SherlockValidStringSolution.isValid(input));
    }
}
