package com.sagar.basics;

public class Factorial {

    public static void main(String[] args) {
        long res= fact(10);
        System.out.println(res);
    }

    private static long fact(int n) {

        if(n==1) return 1;

        return n* fact(n-1);
    }
}
