package com.percyvega;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.printValues("Nico", 9);
        main.printValues("Percy", 45);
        main.printValues("Isa", 6);
    }

    void printValues(String name, int age) {
        System.out.println(name + " " + age);
    }

}