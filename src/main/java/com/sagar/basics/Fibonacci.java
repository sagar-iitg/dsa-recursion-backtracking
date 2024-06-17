package com.sagar.basics;


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        long ans=fibo(45);
        System.out.println(ans);
    }

    private static long fibo(int n) {

        if(n==0 || n==1) return n;

        return fibo(n-1)+fibo(n-2);
    }

    public static class Counting {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number");
            int n=sc.nextInt();
            System.out.println("-----");
            solve(n);
            sc.close();
        }
        private static void solve(int n)
        {
            // base condition
            if(n==0)
                return;
            //processing
            System.out.println(n);
            //recurrence relation
            solve(n-1);


        }

    }
}
