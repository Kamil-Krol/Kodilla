package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations()
    {
        calculator.add(2.5,3.6);
        calculator.div(6,3);
        calculator.sub(2.1,0.6);
        calculator.mul(2,2.5);
    }
}
