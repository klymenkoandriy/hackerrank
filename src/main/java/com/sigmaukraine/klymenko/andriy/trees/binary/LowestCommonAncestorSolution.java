package com.sigmaukraine.klymenko.andriy.trees.binary;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=trees">Binary Search Tree : Lowest Common Ancestor</a>
 */
public class LowestCommonAncestorSolution {

    public static Node lca(Node root, int v1, int v2) {

        if(root.data < v1 && root.data < v2){
            return lca(root.right, v1, v2);
        }

        if(root.data > v1 && root.data > v2){
            return lca(root.left, v1, v2);
        }

        return root;
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}
