package com.sagar.basics;




public class Fibonacci {
    public static void main(String[] args) {
        long ans=fibo(45);
        System.out.println(ans);
    }

    private static long fibo(int n) {

        if(n==0 || n==1) return n;

        return fibo(n-1)+fibo(n-2);
    }
}
