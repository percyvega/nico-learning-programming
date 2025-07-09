package com.percyvega;

public class NicosFirstApplication {

    public static void main(String[] args) {

        NicosFirstApplication application = new NicosFirstApplication();

//        application.printValues("Nico", 9);
//        application.printValues("Percy", 45);
//        application.printValues("Isa", 6);

//        int sum = application.addValues(9, 6);
//        System.out.println(sum);

        for (int i = 1; i <= 100; i = i + 1) {
            int dividend = i;
            int divisor = 7;
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            if (remainder > 0) {
                System.out.println(dividend + " divided by " + divisor + " is " + quotient + " with a remainder of " + remainder);
            } else {
                System.out.println(dividend + " divided by " + divisor + " is " + quotient + " with no remainder");
            }
        }


    }

    void printValues(String name, int age) {

        System.out.println(name + " " + age);

    }

    int addValues(int addend1, int addend2) {
        return addend1 + addend2;
    }

}