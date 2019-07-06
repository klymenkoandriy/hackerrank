package com.sigmaukraine.klymenko.andriy.trees.huffman;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HuffmanDecodingSolutionTest {

    static Collection<Object[]> data() {
        return asList(new Object[][]{
                {createTree(), "1001011", "ABACA"}
        });
    }

    @ParameterizedTest
    @DisplayName("Should return decoded string")
    @MethodSource("data")
    void decode(Node root, String input, String expected) {
        assertEquals(expected, new HuffmanDecodingSolution().decodeString(input, root));
    }

    private static Node createTree() {
        Node leafA = new HuffmanLeaf(3, 'A');
        Node leafB = new HuffmanLeaf(1, 'B');
        Node leafC = new HuffmanLeaf(1, 'C');
        Node nodeBC = new HuffmanNode(leafB, leafC);
        Node root = new HuffmanNode(nodeBC, leafA);
        return root;
    }
}
