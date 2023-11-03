package com.sagar.basics;

public class SumOfDigit {

    public static void main(String[] args) {

        int res=sumOfDigit(12345);
        System.out.println(res);
    }

    private static int sumOfDigit(int n) {

        if(n==0) return 0;

        int lastDigitFromInteger=n%10;
        int removeLastDigitFromInteger=n/10;
        return  lastDigitFromInteger+sumOfDigit(removeLastDigitFromInteger);

    }

}
