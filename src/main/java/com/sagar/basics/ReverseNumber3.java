package com.sagar.basics;

public class ReverseNumber3 {


    public static void main(String[] args) {

        int n=8;
        int noOfDigits=(int)Math.log10(n)+1;
        System.out.println(noOfDigits);
        int ans=reverseNumber(n,noOfDigits);
        System.out.println(ans);



    }

    private  static int reverseNumber(int n,int arg) {

        if(n==0) return 0;
        int lastDigit=n%10;
        int removeDigit=n/10;

       return (int) (lastDigit*Math.pow(10,arg-1)+reverseNumber(removeDigit,arg-1));
    }
}
