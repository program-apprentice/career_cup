package com.programapprentice.app.ch01;

/**
 * User: program-apprentice
 * Date: 8/9/15
 * Time: 8:03 PM
 */
public class Question1_6 {
    public void rotate(int[][] matrix) {
        if(matrix == null) {
            return;
        }
        int n = matrix.length;
        int halfLength = n/2;
        int tmp = 0;
        for(int i = 0; i < halfLength; i++) {
            for(int j = i; j < n-i-1; j++) {
                tmp = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }
}
