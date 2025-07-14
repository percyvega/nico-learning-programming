package com.percyvega;

public class NicoEven {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i = i + 1) {
            int mod = i % 2;

            if(mod == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }

        System.out.println("Nico2 finished!");
    }
}
