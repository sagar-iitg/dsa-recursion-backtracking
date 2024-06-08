package com.sagar.basics;

public class ProductOfDigit {

    public static void main(String[] args) {

        int res=productOfDigit(58);
        System.out.println(res);
    }

    private static int productOfDigit(int n) {

        if(n==0) return 1;

        int lastDigitFromInteger=n%10;
        int removeLastDigitFromInteger=n/10;
        return  lastDigitFromInteger*productOfDigit(removeLastDigitFromInteger);

    }

}
