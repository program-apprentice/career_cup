package com.programapprentice.app.ch01;

/**
 * User: program-apprentice
 * Date: 8/7/15
 * Time: 10:04 PM
 */
/**
 * Implement a method to perform basic string compression using the counts of
 * repeated characters. For example, the string aabcccccaaa would become
 * a2blc5a3. If the "compressed" string would not become smaller than the original
 * string, your method should return the original string.*/
public class Question1_5 {
    public static String compress(String str) {
        if(str == null || str.length() < 2) {
            return str;
        }
        StringBuffer sb = new StringBuffer();
        char pre = str.charAt(0);
        char cur = pre;
        int counter = 1;
        for(int i = 1; i < str.length(); i++) {
            cur = str.charAt(i);
            if(cur == pre) {
                counter++;
            } else {
                sb.append(pre);
                sb.append(counter);
                pre = cur;
                counter = 1;
            }
        }
        sb.append(cur);
        sb.append(counter);
        if(sb.length() < str.length()) {
            return sb.toString();
        } else {
            return str;
        }
    }
}
