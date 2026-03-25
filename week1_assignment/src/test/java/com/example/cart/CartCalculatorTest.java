package com.example.cart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartCalculatorTest {

    @Test
    public void testItemTotal() {
        CartCalculator calc = new CartCalculator();
        assertEquals(20.0, calc.calculateItemTotal(10.0, 2));
    }

    @Test
    public void testCartTotal() {
        CartCalculator calc = new CartCalculator();
        double[] totals = {10.0, 20.0, 30.0};
        assertEquals(60.0, calc.calculateCartTotal(totals));
    }
}