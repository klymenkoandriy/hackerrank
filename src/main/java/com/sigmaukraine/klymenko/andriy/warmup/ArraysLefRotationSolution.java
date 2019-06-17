package com.sigmaukraine.klymenko.andriy.warmup;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays">Arrays: Left Rotation</a>
 */
public class ArraysLefRotationSolution {

    /**
     * Additional array with the same size. Loop by index.
     */
    static int[] rotLeft(int[] a, int d) {
        int length = a.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            int putIndex = (i+ length - d % length) % length;
            result[putIndex] = a[i];
        }

        return result;
    }

    /**
     * Additional array with the size of 1/2 of given array or less.
     */
    static int[] rotLeftMemorySafe(int[] a, int d) {
        int length = a.length;
        int lr = d % length;
        if (lr > length / 2) {
            modify(a, length - lr, lr, lr, 0 ,0, length - lr);
        } else {
            modify(a, lr, length - lr, 0, length - lr, lr, 0);
        }
        return a;
    }

    private static void modify(int[] a, int smallSize, int bigSize, int oldSmallIndex, int newSmallIndex,
                                    int oldBigIndex, int newBigIndex) {
        int[] buffer = new int[smallSize];
        System.arraycopy(a, oldSmallIndex, buffer, 0, smallSize);   // copy small part to buffer
        System.arraycopy(a, oldBigIndex, a, newBigIndex, bigSize);          // move big part
        System.arraycopy(buffer, 0, a, newSmallIndex, smallSize);    // copy small parn from buffer
    }

    /**
     * Simple shift without additional array.
     */
    static int[] rotLeftShift(int[] a, int d) {
        int length = a.length;

        for (int i = 0; i < d; i++) {
            int buffer = a[0];
            int j;
            for (j = 0; j < length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[j] = buffer;
        }

        return a;
    }
}
