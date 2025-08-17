package com.sprint.jw.godofjava.Volume1.Chapter03;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Calculator class started");

        Calculator calc = new Calculator();
        int a = 10;
        int b = 5;
        calc.add(a, b);
        calc.subtract(a, b);
        calc.multiply(a, b);
        calc.divide(a, b);
        System.out.println("a = " + a + " b = " + b);
        System.out.println("add: " + calc.add(a, b));
        System.out.println("subtract: " + calc.subtract(a, b));
        System.out.println("multiply: " + calc.multiply(a, b));
        System.out.println("divide: " + calc.divide(a, b));

        a = 3;
        b = 6;
        calc.add(a, b);
        calc.subtract(a, b);
        calc.multiply(a, b);
        calc.divide(a, b);
        System.out.println("a = " + a + " b = " + b);
        System.out.println("add: " + calc.add(a, b));
        System.out.println("subtract: " + calc.subtract(a, b));
        System.out.println("multiply: " + calc.multiply(a, b));
        System.out.println("divide: " + calc.divide(a, b));
    }
}
