package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculatorTest {

    @InjectMocks
    Calculator calculator;

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }
    @Test
    public void testSub() {   assertEquals(-3, calculator.sub(3, 6));  }
    @Test
    public void testMul() {
        assertEquals(10, calculator.mul(2, 5));
    }
    @Test
    public void testDiv() {
        assertEquals(6, calculator.div(12, 2));
    }
}