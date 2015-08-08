package com.programapprentice.app.ch01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: program-apprentice
 * Date: 8/7/15
 * Time: 9:57 PM
 */
public class Question1_4_Test {
    @Test
    public void test1() {
        String input = "abc dc dd   ";
        String expected = "abc%20dc%20dd%20%20%20";
        String actual = Question1_4.encoding(input);
        assertEquals(expected, actual);
    }
}
