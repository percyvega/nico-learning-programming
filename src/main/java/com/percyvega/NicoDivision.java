package com.percyvega;

public class NicoDivision {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i = i + 1) {

            int dividend = i;
            int divisor = 7;
            int quotient = divide(dividend, divisor);
            int remainder = modulus(dividend, divisor);

            if (remainder > 0) {
                println(dividend + " divided by " + divisor + " is " + quotient + " with a remainder of " + remainder);
            } else {
                println(dividend + " divided by " + divisor + " is " + quotient + " with no remainder");
            }
        }
    }

    static void println(String message) {
        System.out.println(message);
    }

    static void printValues(String name, int age) {
        System.out.println(name + " " + age);
    }

    static int addValues(int addend1, int addend2) {
        return addend1 + addend2;
    }

    static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    static int modulus(int dividend, int divisor) {
        return dividend % divisor;
    }

}