package com.xwoder.junit.com.xwoder.junit;

import com.xwoder.junit.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.add(1, 2));
    }
}
