package com.programapprentice.app.ch01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: ruijiang
 * Date: 8/4/15
 * Time: 2:24 PM
 */
public class Question_1_2_Test {
    @Test
    public void test1() {
        String s = "abcd";
        String expected = "dcba";
        String actual = Question1_2.reverse(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String s = "a";
        String expected = "a";
        String actual = Question1_2.reverse(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String s = "ab";
        String expected = "ba";
        String actual = Question1_2.reverse(s);
        assertEquals(expected, actual);
    }
}
