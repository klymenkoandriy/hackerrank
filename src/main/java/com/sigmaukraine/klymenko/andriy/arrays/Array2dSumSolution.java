package com.sigmaukraine.klymenko.andriy.arrays;

/**
 * Solution for <a href="https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays">2D Array - DS</a>
 */
public class Array2dSumSolution {

    static int hourglassSum(int[][] arr) {
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int sum = hourglassSum(arr, i, j);
                if(result < sum){
                    result = sum;
                }
            }
        }

        return result;
    }

    private static int hourglassSum(int[][] arr, int xTop, int yTop) {
        int result = 0;
        int count = 0;
        for(int i = xTop; i < xTop + 3; i++){
            for(int j = yTop; j < yTop + 3; j++){
                if(count != 3 && count != 5){
                    result += arr[i][j];
                }
                count++;
            }
        }

        return result;
    }
}
