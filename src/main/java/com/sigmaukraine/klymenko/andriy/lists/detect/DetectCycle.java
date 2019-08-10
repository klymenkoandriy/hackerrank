package com.sigmaukraine.klymenko.andriy.lists.detect;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists">Detect a Cycle</a>.
 */
public class DetectCycle {

    public boolean hasCycle(Node head) {
        Node first = head;
        Node second = head;

        while (first != null && first.next != null) {
            first = first.next.next;
            second = second.next;

            if (second.equals(first)) {
                return true;
            }
        }

        return false;
    }
}
