package com.sigmaukraine.klymenko.andriy.lists.reverse;

public class Solution {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("[");
            DoublyLinkedListNode node = this;

            while (node != null) {
                builder.append(node.data);
                if (node.next != null) {
                    builder.append(", ");
                }
                node = node.next;
            }

            builder.append("]");
            return builder.toString();
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }

        public static DoublyLinkedList of(int... values) {
            DoublyLinkedList list = new DoublyLinkedList();
            for (int value : values) {
                list.insertNode(value);
            }
            return list;
        }

    }

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        if (head == null || (head.next == null && head.prev == null)) {
            return head;
        }

        DoublyLinkedListNode nodeBuff = null;

        while (head != null) {
            nodeBuff = head;
            DoublyLinkedListNode nextBuff = head.next;
            head.next = head.prev;
            head.prev = nextBuff;
            head = nextBuff;
        }

        return nodeBuff;
    }

}
