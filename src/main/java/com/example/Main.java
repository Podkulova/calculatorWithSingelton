package com.example;

public class Main {
    public static void main(String[] args) {
        // Vytvoříme instanci
        Calculator calculator = Calculator.getInstance();

        System.out.println("Addition: " + calculator.add(5, 5));
        System.out.println("Subtraction: " + calculator.subtract(20, 10));
        System.out.println("Multiplication: " + calculator.multiply(5, 2));
        System.out.println("Division: " + calculator.divide(50, 5));
    }
}
