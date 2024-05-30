package com.example;

public class Calculator {
    // Zajistíme, aby byla pouze jedna instance
    private static Calculator instance;

    // Privátním konstruktorem zajistíme, aby žádná jiná třída nemohla vytvářet instance třídy Singleton přímo
    private Calculator() {
    }

    // Metoda, která nám poskytne přístup k jediné instanci
    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    // Matematické funkce
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return (double) a / b;
    }
}
