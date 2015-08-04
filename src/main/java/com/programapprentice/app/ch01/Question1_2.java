package com.programapprentice.app.ch01;

/**
 * Created with IntelliJ IDEA.
 * User: ruijiang
 * Date: 8/4/15
 * Time: 1:58 PM
 */
/**
 * Implement a function void reverse(char* str) in C or C++ which reverses a nullterminated
 * string.
 * */
public class Question1_2 {
    public static String reverse(String str) {
        if(str == null) {
            return str;
        }

        char[] buffer = str.toCharArray();
        int length = str.length();
        int halfLength = str.length() / 2;
        char tmp;
        for(int i = 0; i < halfLength; i++) {
            tmp = buffer[i];
            buffer[i] = buffer[length - 1 - i];
            buffer[length - 1 - i] = tmp;
        }
        return new String(buffer);
    }
}
