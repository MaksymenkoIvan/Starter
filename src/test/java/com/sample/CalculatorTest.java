package com.sample;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void sum_withNegativInput() {
        int res = calculator.add(-3, -3);
        Assert.assertEquals(-6, res);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sum_withBigValue() {
        int res = calculator.add(Integer.MAX_VALUE, 3);
        Assert.assertEquals(new IllegalArgumentException("Not allowed parameter"), res);
    }

    @Test
    public void sum_withZero() {
        Assert.assertEquals(0, calculator.add(-8, 8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void sum_withSmallValue() {
        int res = calculator.add(Integer.MIN_VALUE, -3);
        Assert.assertEquals(new IllegalArgumentException("Not allowed parameter"), res);
    }

    @Test
    public void sum_withRegularValue() {
        int resultRegular = calculator.add(7, 3);
        Assert.assertEquals(10, resultRegular);
    }

    @Test
    public void sub_withNegativInput() {
        int res = calculator.subtraction(-3, 3);
        Assert.assertEquals(-6, res);
    }

    @Test
    public void sub_withZero() {
        int res = calculator.subtraction(8, 8);
        Assert.assertEquals(0, res);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sub_withBigValue() {
        int res = calculator.subtraction(Integer.MAX_VALUE, -3);
        Assert.assertEquals(new IllegalArgumentException("Not allowed parameter"), res);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sub_withSmallValue() {
        int res = calculator.subtraction(Integer.MIN_VALUE, 3);
        Assert.assertEquals(new IllegalArgumentException("Not allowed parameter"), res);
    }

    @Test
    public void sub_withRegularValue() {
        int resultRegular = calculator.subtraction(7, 3);
        Assert.assertEquals(4, resultRegular);
    }
}
