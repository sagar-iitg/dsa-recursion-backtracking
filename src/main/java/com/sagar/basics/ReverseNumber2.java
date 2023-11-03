package com.sagar.basics;

public class ReverseNumber2 {
    static int rev=0;

    public static void main(String[] args) {


        reverseNumber(123456);
        System.out.println(rev);

    }

    private  static void reverseNumber(int n) {

        if(n==0) return;
        int lastDigit=n%10;
        int removeDigit=n/10;
        rev=rev*10+lastDigit;
        reverseNumber(removeDigit);
    }
}
