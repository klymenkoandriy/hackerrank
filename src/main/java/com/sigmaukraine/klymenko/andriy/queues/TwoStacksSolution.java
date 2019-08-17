package com.sigmaukraine.klymenko.andriy.queues;

import java.util.Stack;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues">Queues: A Tale of Two Stacks</a>
 */
public class TwoStacksSolution {

    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) {
            stackNewestOnTop.push(value);
        }

        public T peek() {
            moveData();
            return stackOldestOnTop.peek();
        }

        public T dequeue() {
            moveData();
            return stackOldestOnTop.pop();
        }

        private void moveData() {
            if(stackOldestOnTop.empty()) {
                while(!stackNewestOnTop.empty()) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }
    }
}
