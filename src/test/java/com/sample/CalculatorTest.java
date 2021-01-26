package com.sample;

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void add_withNegativInput() {
        int res = calculator.add(-3, -3);
        Assert.assertEquals(-6, res);
    }

    @Test
    public void add_withBigValue() {
        Exception exception = assertThrows (IllegalArgumentException.class, () -> calculator.add(Integer.MAX_VALUE, 2));
    }

    @Test
    public void add_withZero() {
        Assert.assertEquals(0, calculator.add(-8, 8));
    }

    @Test
    public void add_withSmallValue() {
        Exception exception = assertThrows (IllegalArgumentException.class, () -> calculator.add(Integer.MIN_VALUE, -2));
    }

    @Test
    public void add_withRegularValue() {
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

    @Test
    public void sub_withBigValue() {
        Exception exception = assertThrows (IllegalArgumentException.class, () -> calculator.subtraction(Integer.MAX_VALUE, -2));
    }

    @Test
    public void sub_withSmallValue() {
        Exception exception = assertThrows (IllegalArgumentException.class, () -> calculator.subtraction(Integer.MIN_VALUE, 2));
    }

    @Test
    public void sub_withRegularValue() {
        int resultRegular = calculator.subtraction(7, 3);
        Assert.assertEquals(4, resultRegular);
    }
}
