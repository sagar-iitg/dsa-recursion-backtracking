package com.sagar.basics;

public class NumbersExampleRecursion {

    public static void main(String[] args) {
        //print first five number
        int n=5;
        print(n);
    }

    private static void print(int n) {
        if(n==0) return;
        print(n-1);
        System.out.println(n);

    }


}
