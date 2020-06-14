package com.example.laboratory.test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        double sum = calculator.add(1d, 2d);
        assertThat(sum, is(equalTo(3d)));
    }

}
