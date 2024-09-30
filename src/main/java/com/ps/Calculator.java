package com.ps;

public class Calculator {
    public static void main(String[] args) {
        // Example usage:
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
        System.out.println("Modulo: " + modulo(num1, num2));
    }

    // Static add method
    public static int add(int a, int b) {
        return a + b;
    }

    // Static subtract method
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Static multiplication method
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static division method
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    // Static modulo method
    public static int modulo(int a, int b) {
        return a % b;
    }
}
