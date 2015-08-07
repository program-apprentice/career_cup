package com.programapprentice.app.ch01;

/**
 * User: program-apprentice
 * Date: 8/5/15
 * Time: 6:35 PM
 */

import java.util.Arrays;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 * */
public class Question1_3 {
    // Sort the array of char and compare whether they are the same
    public static boolean isPermutation(String s1, String s2) {
        if(s1 == null && s2 == null) {
            return true;
        }
        if(s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        int len = s1.length();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i = 0; i < len; i++) {
            if(ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }
}
