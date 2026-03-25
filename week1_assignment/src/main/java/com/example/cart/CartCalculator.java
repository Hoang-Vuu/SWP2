package com.example.cart;

public class CartCalculator {

    public double calculateItemTotal(double price, int quantity) {
        return price * quantity;
    }

    public double calculateCartTotal(double[] itemTotals) {
        double sum = 0;
        for (double total : itemTotals) sum += total;
        return sum;
    }
}