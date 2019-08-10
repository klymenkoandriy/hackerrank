package com.sigmaukraine.klymenko.andriy.lists.insertspecific;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists">Insert a node at a specific position in a linked lis</a>.
 */
public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }

        public static SinglyLinkedList of(int... values) {
            SinglyLinkedList list = new SinglyLinkedList();
            for (int value : values) {
                list.insertNode(value);
            }
            return list;
        }
    }

    public static String toStringValues(SinglyLinkedListNode head) {
        StringBuilder builder = new StringBuilder("[");

        while (head != null) {
            builder.append(head.data);
            if (head.next != null) {
                builder.append(", ");
            }
            head = head.next;
        }

        builder.append("]");
        return builder.toString();
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode =  new SinglyLinkedListNode(data);

        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        int i = 1;
        SinglyLinkedListNode node = head;
        while (i++ < position){
            node = node.next;
        }
        newNode.next = node.next;
        node.next = newNode;

        return head;
    }

}
