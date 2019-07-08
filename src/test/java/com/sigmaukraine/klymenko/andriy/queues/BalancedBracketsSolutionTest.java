package com.sigmaukraine.klymenko.andriy.queues;

import com.sigmaukraine.klymenko.andriy.strings.AlternatingCharactersSolution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalancedBracketsSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {"{[()]}", "YES"},
                {"}][}}(}][))]", "NO"},
                {"{{}(", "NO"}
        });
    }

    @ParameterizedTest(name = "input = {0}, expected = {1}")
    @DisplayName("Should return a string: YES if the sequence is balanced or NO if it is not.")
    @MethodSource("data")
    void check(String input, String expected) {
        assertEquals(expected, BalancedBracketsSolution.isBalanced(input));
    }
}
