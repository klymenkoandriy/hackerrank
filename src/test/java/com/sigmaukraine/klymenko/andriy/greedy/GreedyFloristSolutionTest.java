package com.sigmaukraine.klymenko.andriy.greedy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreedyFloristSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {new int[]{1, 3, 5, 7, 9}, 3, 29},
                {new int[]{390225, 426456, 688267, 800389, 990107, 439248, 240638, 15991, 874479, 568754, 729927,
                        980985, 132244, 488186, 5037, 721765, 251885, 28458, 23710, 281490, 30935, 897665, 768945,
                        337228, 533277, 959855, 927447, 941485, 24242, 684459, 312855, 716170, 512600, 608266,
                        779912, 950103, 211756, 665028, 642996, 262173, 789020, 932421, 390745, 433434, 350262,
                        463568, 668809, 305781, 815771, 550800}, 3, 163578911}
        });
    }

    @ParameterizedTest(name = "prices = {0}, friends = {1}, expected result = {2}")
    @DisplayName("Should return the minimum cost to purchase all of the flowers.")
    @MethodSource("data")
    void countMinimumCost(int[] prices, int friends, int expected) {
        assertEquals(expected, GreedyFloristSolution.getMinimumCost(friends, prices));
    }
}
