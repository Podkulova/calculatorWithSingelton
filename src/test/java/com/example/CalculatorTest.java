package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = Calculator.getInstance();
    }

    @Test
    public void testAddition() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    public void testMultiplication() {
        assertEquals(10, calculator.multiply(5, 2));
    }

    @Test
    public void testDivision() {
        assertEquals(10, calculator.divide(50, 5));
    }

    // Ověříme, zda divide vyvolává výjimku ArithmeticException při dělení nulou
    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

}