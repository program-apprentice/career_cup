package com.programapprentice.app.ch01;

/**
 * User: program-apprentice
 * Date: 8/9/15
 * Time: 9:28 PM
 */
public class Question1_7 {
    // refer https://leetcode.com/problems/set-matrix-zeroes/
    public void setZeroes(int[][] matrix) {
        if(matrix == null) {
            return;
        }
        int height = matrix.length;
        if(height == 0) {
            return;
        }
        int width = matrix[0].length;
        if(width == 0) {
            return;
        }
        boolean[] rowVector = new boolean[height];
        boolean[] colVector = new boolean[width];
        for(int i = 0; i < height; i ++) {
            for(int j = 0; j < width; j++) {
                if(matrix[i][j] == 0) {
                    rowVector[i] = true;
                    colVector[j] = true;
                }
            }
        }
        for(int i = 0; i < height; i ++) {
            for (int j = 0; j < width; j++) {
                if(rowVector[i]|| colVector[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
