package com.sagar.basics;

public class ReverseNumber {

    public static void main(String[] args) {

        int[] rev={0};
        reverseNumber(123,rev);
        System.out.println(rev[0]);

    }

    private static void reverseNumber(int n,int[] rev) {

        if(n==0) return;
        int lastDigit=n%10;
        int removeDigit=n/10;
        rev[0]=rev[0]*10+lastDigit;
        reverseNumber(removeDigit,rev);
    }
}
