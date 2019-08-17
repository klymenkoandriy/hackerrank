package com.sigmaukraine.klymenko.andriy.queues;

import org.junit.jupiter.api.Test;

import com.sigmaukraine.klymenko.andriy.queues.TwoStacksSolution.MyQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoStacksSolutionTest {

    @Test
    void check() {
        int[] input = { 1, 2, 3, 4, 5 };

        MyQueue<Integer> queue = new MyQueue<>();
        for (int val : input) {
            queue.enqueue(val);
        }

        for (int val : input) {
            assertEquals(val, queue.peek());
            assertEquals(val, queue.dequeue());
        }
    }
}
