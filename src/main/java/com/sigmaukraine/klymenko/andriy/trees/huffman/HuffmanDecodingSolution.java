package com.sigmaukraine.klymenko.andriy.trees.huffman;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/tree-huffman-decoding/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=trees">Tree: Huffman Decoding</a>
 */
public class HuffmanDecodingSolution {

    void decode(String s, Node root) {
        System.out.println(decodeString(s, root));
    }

    String decodeString(String s, Node root) {

        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();

        Node node = root;

        for (char ch : chars) {
            node = ch == '1' ? node.right : node.left;
            if (node.data != 0) {
                result.append(node.data);
                node = root;
            }
        }

        return result.toString();
    }

}
