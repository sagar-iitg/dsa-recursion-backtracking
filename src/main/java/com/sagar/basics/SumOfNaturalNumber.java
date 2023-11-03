package com.sagar.basics;

public class SumOfNaturalNumber {

    public static void main(String[] args) {
        int res=sum(500);
        System.out.println(res);
    }

    private static int sum(int n) {

        if(n==1) return 1;

        return n+sum(n-1);
    }
}
