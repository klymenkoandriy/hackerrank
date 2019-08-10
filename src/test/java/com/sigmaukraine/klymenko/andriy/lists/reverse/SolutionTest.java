package com.sigmaukraine.klymenko.andriy.lists.reverse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static com.sigmaukraine.klymenko.andriy.lists.reverse.Solution.DoublyLinkedListNode;
import static com.sigmaukraine.klymenko.andriy.lists.reverse.Solution.DoublyLinkedList;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {DoublyLinkedList.of(1, 2, 3, 4 ,5), DoublyLinkedList.of(5, 4, 3, 2, 1)}
        });
    }

    @ParameterizedTest(name = "reverse")
    @DisplayName("Should return a reference to the head of a reversed list.")
    @MethodSource("data")
    void reverse(DoublyLinkedList initialList, DoublyLinkedList expectedList) {
        DoublyLinkedListNode actualNode = Solution.reverse(initialList.head);

        assertEquals(actualNode.toString(), expectedList.head.toString());
    }

}
