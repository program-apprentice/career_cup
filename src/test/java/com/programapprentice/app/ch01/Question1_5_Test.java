package com.programapprentice.app.ch01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: program-apprentice
 * Date: 8/7/15
 * Time: 10:08 PM
 */
public class Question1_5_Test {
    @Test
    public void test1() {
        String input = "aabcccccaaa";
        String expected = "a2b1c5a3";
        String actual = Question1_5.compress(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String input = "aaabbbbc";
        String expected = "a3b4c1";
        String actual = Question1_5.compress(input);
        assertEquals(expected, actual);
    }
}
