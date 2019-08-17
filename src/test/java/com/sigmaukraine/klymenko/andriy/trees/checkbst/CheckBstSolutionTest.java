package com.sigmaukraine.klymenko.andriy.trees.checkbst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckBstSolutionTest {

    @Test
    void testCorrect() {
        assertTrue(new CheckBstSolution().checkBST(correctBst()));
    }

    @Test
    void testIncorrect() {
        assertFalse(new CheckBstSolution().checkBST(incorrectBst()));
    }

    private Node correctBst() {
        return new Node(3,
                new Node(2,
                        new Node(1,
                                null,
                                null),
                        null),
                new Node(5,
                        new Node(4,
                                null,
                                null),
                        new Node(6,
                                null,
                                null)));


    }

    private Node incorrectBst() {
        return new Node(3,
                new Node(2,
                        new Node(1,
                                null,
                                null),
                        null),
                new Node(4,
                        new Node(5,
                                null,
                                null),
                        new Node(6,
                                null,
                                null)));


    }
}
