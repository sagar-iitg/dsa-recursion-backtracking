package com.sagar.basics;

public class ReverseNumber1 {
    int rev=0;

    public static void main(String[] args) {

        ReverseNumber1 obj=new ReverseNumber1();
        obj.reverseNumber(123456);
        System.out.println(obj.rev);

    }

    private  void reverseNumber(int n) {

        if(n==0) return;
        int lastDigit=n%10;
        int removeDigit=n/10;
        rev=rev*10+lastDigit;
        reverseNumber(removeDigit);
    }
}
