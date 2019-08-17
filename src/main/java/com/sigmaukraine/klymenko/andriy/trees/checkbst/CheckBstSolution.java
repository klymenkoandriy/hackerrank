package com.sigmaukraine.klymenko.andriy.trees.checkbst;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=trees">Trees: Is This a Binary Search Tree</a>
 */
public class CheckBstSolution {

    boolean checkBST(Node root) {
        return checkBST(root, 0, 10000);
    }

    boolean checkBST(Node root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }

        if (root.data < minValue || root.data > maxValue) {
            return false;
        }

        return (checkBST(root.left, minValue, root.data - 1)
                &&  checkBST(root.right, root.data + 1, maxValue));
    }
}
