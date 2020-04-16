package com.example.laboratory.test;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.add(1, 2);
        Assert.assertEquals(3, sum);
    }

    @Test
    public void testAdd2() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.add(1, 2);
        Assert.assertEquals(2, sum);
    }
}
