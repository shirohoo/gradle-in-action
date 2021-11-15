package io.github.shirohoo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sum() throws Exception {
        int sum = calculator.sum(5, 7);
        assertEquals(12, sum);
    }

    @Test
    void minus() throws Exception {
        int minus = calculator.minus(5, 7);
        assertEquals(-2, minus);
    }

}