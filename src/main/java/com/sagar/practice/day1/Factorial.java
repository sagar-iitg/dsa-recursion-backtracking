package com.sagar.practice.day1;

public class Factorial {


    public static void main(String[] args) {
        
        int input=5;
        int res=fibo(input);
        System.out.println(res);

    }
    private static int fibo(int n)
    {
        //handling invalid input
        if(n<0)
            return -1;
        if( n>=0 && n<=1)
            return 1;

        return n*fibo(n-1);

    }
}
