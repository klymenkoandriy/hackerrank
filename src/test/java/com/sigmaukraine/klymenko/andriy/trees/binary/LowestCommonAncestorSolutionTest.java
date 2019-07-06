package com.sigmaukraine.klymenko.andriy.trees.binary;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonAncestorSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {create( new int[]{4, 2, 3, 1, 7, 6}), 1, 7, 4},
                {create( new int[]{2, 1, 5, 3, 4, 6}), 4, 6, 5}
        });
    }

    @ParameterizedTest(name = "root = {0}, first = {1}, second = {2}, expected = {3}")
    @DisplayName("Should return a pointer to the lowest common ancestor node of the two values given")
    @MethodSource("data")
    void calculateMaximumToys(Node input, int first, int second, int expected) {
        assertEquals(expected, LowestCommonAncestorSolution.lca(input, first, second).data);
    }

    private static Node create(int[] data) {
        Node node = null;
        for (int val : data) {
            node = LowestCommonAncestorSolution.insert(node, val);
        }

        return node;
    }
}
