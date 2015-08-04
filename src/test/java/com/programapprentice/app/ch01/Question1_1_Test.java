package com.programapprentice.app.ch01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: ruijiang
 * Date: 8/4/15
 * Time: 2:04 PM
 */
public class Question1_1_Test {
    @Test
    public void test1() {
        String s = "a;sdlfkjaep1o3u";
        boolean expected = false;
        boolean actual = Question1_1.isUnique(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String s = "a;sdlfkj";
        boolean expected = true;
        boolean actual = Question1_1.isUnique(s);
        assertEquals(expected, actual);
    }
}
