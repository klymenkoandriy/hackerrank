package com.sigmaukraine.klymenko.andriy.lists.insertspecific;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static com.sigmaukraine.klymenko.andriy.lists.insertspecific.Solution.SinglyLinkedList;
import static com.sigmaukraine.klymenko.andriy.lists.insertspecific.Solution.SinglyLinkedListNode;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {SinglyLinkedList.of(16, 13, 7), 1, 2, SinglyLinkedList.of(16, 13, 1, 7)}
        });
    }

    @ParameterizedTest(name = "insert")
    @DisplayName("Should return a reference to the head node of a finished list with inserted node")
    @MethodSource("data")
    void insert(SinglyLinkedList initialList, int data, int position, SinglyLinkedList expectedList) {
        SinglyLinkedListNode actualNode = Solution.insertNodeAtPosition(initialList.head, data, position);

        assertEquals(Solution.toStringValues(expectedList.head), Solution.toStringValues(actualNode));
    }

}
