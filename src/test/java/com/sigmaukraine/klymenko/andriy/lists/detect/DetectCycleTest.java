package com.sigmaukraine.klymenko.andriy.lists.detect;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DetectCycleTest {

    private DetectCycle detectCycle = new DetectCycle();

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {graphWithoutCycle(), false},
                {graphWithCycle(), true}
        });
    }

    @ParameterizedTest(name = "expected = {1}")
    @DisplayName("Should return true if the graph contains a cycle, otherwise false.")
    @MethodSource("data")
    void test(Node head, boolean expected) {
        assertEquals(expected, detectCycle.hasCycle(head));
    }

    private static Node graphWithoutCycle() {
        return new Node(0, new Node(1, new Node(2, new Node(3, null))));
    }

    private static Node graphWithCycle() {
        Node node = new Node(0, new Node(1, new Node(2, new Node(3, null))));
        node.next.next.next.setNext(node.next);
        return node;
    }

}
