package com.programapprentice.app.ch01;

/**
 * Created with IntelliJ IDEA.
 * User: ruijiang
 * Date: 8/4/15
 * Time: 1:52 PM
 */

/**
 * Implement an algorithm to determine if a string has all unique characters. What
 * if you cannot use additional data structures?
*/
public class Question1_1 {
    public static boolean isUnique(String input) {
        boolean result = true;
        if(input == null) {
            return result;
        }
        boolean record[] = new boolean[255];

        for(int i = 0; i < input.length(); i++) {
            if(record[input.charAt(i)]) {
                result = false;
                break;
            } else {
                record[input.charAt(i)] = true;
            }
        }

        return result;
    }
}
