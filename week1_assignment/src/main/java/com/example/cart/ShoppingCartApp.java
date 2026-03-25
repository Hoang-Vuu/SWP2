package com.example.cart;

import java.util.*;

public class ShoppingCartApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select language (1=English, 2=Finnish, 3=Swedish, 4=Japanese): ");
        int choice = sc.nextInt();

        Locale locale = switch (choice) {
            case 2 -> new Locale("fi", "FI");
            case 3 -> new Locale("sv", "SE");
            case 4 -> new Locale("ja", "JP");
            default -> new Locale("en", "US");
        };

        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);
        CartCalculator calc = new CartCalculator();

        System.out.println(rb.getString("enter.items"));
        int itemCount = sc.nextInt();

        double[] itemTotals = new double[itemCount];

        for (int i = 0; i < itemCount; i++) {
            System.out.println(rb.getString("enter.price"));
            double price = sc.nextDouble();

            System.out.println(rb.getString("enter.qty"));
            int qty = sc.nextInt();

            itemTotals[i] = calc.calculateItemTotal(price, qty);
        }

        double total = calc.calculateCartTotal(itemTotals);

        System.out.println(rb.getString("total.cost") + " " + total);
    }
}