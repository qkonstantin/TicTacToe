package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Test {
    Model model = new Model();

    private final FieldState x = FieldState.CROSS;
    private final FieldState o = FieldState.TOE;

    @org.junit.Test
    public void test1() {
        model.setValue(0, 0, x);
        model.setValue(0, 1, x);
        model.setValue(0, 2, x);
        boolean result = model.checkWinner(x);
        assertTrue(result);
    }

    @org.junit.Test
    public void test2() {
        model.setValue(1, 0, x);
        model.setValue(1, 1, x);
        model.setValue(1, 2, x);
        boolean result = model.checkWinner(x);
        assertTrue(result);
    }

    @org.junit.Test
    public void test3() {
        model.setValue(2, 0, x);
        model.setValue(2, 1, x);
        model.setValue(2, 2, x);
        boolean result = model.checkWinner(x);
        assertTrue(result);
    }

    @org.junit.Test
    public void test4() {
        model.setValue(0, 0, x);
        model.setValue(1, 0, x);
        model.setValue(2, 0, x);
        boolean result = model.checkWinner(x);
        assertTrue(result);
    }

    @org.junit.Test
    public void test5() {
        model.setValue(0, 1, x);
        model.setValue(1, 1, x);
        model.setValue(2, 1, x);
        boolean result = model.checkWinner(x);
        assertTrue(result);
    }

    @org.junit.Test
    public void test6() {
        model.setValue(0, 2, x);
        model.setValue(1, 2, x);
        model.setValue(2, 2, x);
        boolean result = model.checkWinner(x);
        assertTrue(result);
    }

    @org.junit.Test
    public void test7() {
        model.setValue(0, 0, x);
        model.setValue(1, 1, x);
        model.setValue(2, 2, x);
        boolean result = model.checkWinner(x);
        assertTrue(result);
    }

    @org.junit.Test
    public void test8() {
        model.setValue(0, 2, x);
        model.setValue(1, 1, x);
        model.setValue(2, 0, x);
        boolean result = model.checkWinner(x);
        assertTrue(result);
    }

    @org.junit.Test
    public void test9() {
        model.setValue(0, 0, o);
        model.setValue(0, 1, o);
        model.setValue(0, 2, o);
        boolean result = model.checkWinner(o);
        assertTrue(result);
    }

    @org.junit.Test
    public void test10() {
        model.setValue(1, 0, o);
        model.setValue(1, 1, o);
        model.setValue(1, 2, o);
        boolean result = model.checkWinner(o);
        assertTrue(result);
    }

    @org.junit.Test
    public void test11() {
        model.setValue(2, 0, o);
        model.setValue(2, 1, o);
        model.setValue(2, 2, o);
        boolean result = model.checkWinner(o);
        assertTrue(result);
    }

    @org.junit.Test
    public void test12() {
        model.setValue(0, 0, o);
        model.setValue(1, 0, o);
        model.setValue(2, 0, o);
        boolean result = model.checkWinner(o);
        assertTrue(result);
    }

    @org.junit.Test
    public void test13() {
        model.setValue(0, 1, o);
        model.setValue(1, 1, o);
        model.setValue(2, 1, o);
        boolean result = model.checkWinner(o);
        assertTrue(result);
    }

    @org.junit.Test
    public void test14() {
        model.setValue(0, 2, o);
        model.setValue(1, 2, o);
        model.setValue(2, 2, o);
        boolean result = model.checkWinner(o);
        assertTrue(result);
    }

    @org.junit.Test
    public void test15() {
        model.setValue(0, 0, o);
        model.setValue(1, 1, o);
        model.setValue(2, 2, o);
        boolean result = model.checkWinner(o);
        assertTrue(result);
    }

    @org.junit.Test
    public void test16() {
        model.setValue(0, 2, o);
        model.setValue(1, 1, o);
        model.setValue(2, 0, o);
        boolean result = model.checkWinner(o);
        assertTrue(result);
    }

    @org.junit.Test
    public void test17() {
        model.setValue(0, 2, o);
        model.setValue(1, 1, x);
        model.setValue(2, 0, x);
        boolean result = model.checkWinner(x);
        assertFalse(result);
    }

    @org.junit.Test
    public void test18() {
        model.setValue(0, 2, o);
        model.setValue(1, 1, o);
        model.setValue(2, 0, x);
        boolean result = model.checkWinner(x);
        assertFalse(result);
    }

    @org.junit.Test
    public void test19() {
        model.setValue(0, 2, o);
        model.setValue(1, 1, o);
        model.setValue(2, 0, o);
        boolean result = model.checkWinner(x);
        assertFalse(result);
    }

    @org.junit.Test
    public void test20() {
        model.setValue(0, 2, o);
        boolean result = model.checkWinner(x);
        assertFalse(result);
    }
}