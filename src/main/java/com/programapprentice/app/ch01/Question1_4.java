package com.programapprentice.app.ch01;

/**
 * User: program-apprentice
 * Date: 8/6/15
 * Time: 10:47 PM
 */
public class Question1_4 {
    public static String encoding(String input) {
        char[] c = input.toCharArray();
        int numOfSpace = 0;
        int i = 0;
        for(; i < input.length(); i++ ) {
            if(c[i] == ' ') {
                numOfSpace++;
            }
        }
        if(numOfSpace == 0) {
            return input;
        }
        int newLength = input.length() + 2 * numOfSpace;
        char[] newBuffer = new char[newLength];
        int j = newLength - 1;
        i = input.length() - 1;
        while(j >= 0) {
            if(c[i] == ' ') {
                newBuffer[j--] = '0';
                newBuffer[j--] = '2';
                newBuffer[j--] = '%';
            } else {
                newBuffer[j--] = c[i];
            }
            i--;
        }
        return new String(newBuffer);
    }
}
