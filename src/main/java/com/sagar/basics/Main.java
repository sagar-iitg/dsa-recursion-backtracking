package com.sagar.basics;


//function is calling another function

public class Main {


    //problem statement print hello world five times
    public static void main(String[] args) {
                message();
    }

    private static void message() {

        System.out.println("hello world");
        message1();
    }
    private static void message1() {

        System.out.println("hello world");
        message2();
    }
    private static void message2() {

        System.out.println("hello world");
        message3();
    }
    private static void message3() {

        System.out.println("hello world");
        message4();
    }
    private static void message4() {

        System.out.println("hello world");
    }
}
