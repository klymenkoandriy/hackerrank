package com.sigmaukraine.klymenko.andriy.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlternatingCharactersSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {"AABAAB", 2},
                {"AAAA", 3},
                {"BBBBB", 4},
                {"ABABABAB", 0},
                {"BABABA", 0},
                {"AAABBB", 4}
        });
    }

    @ParameterizedTest(name = "input = {0}, expected deletions = {1}")
    @DisplayName("Should count required deletions to change input into a string such that there are no matching adjacent characters.")
    @MethodSource("data")
    void countAlternatingCharacters(String input, int expected) {
        assertEquals(expected, AlternatingCharactersSolution.alternatingCharacters(input));
    }
}
