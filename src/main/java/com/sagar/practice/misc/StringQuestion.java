package com.sagar.practice.misc;

public class StringQuestion {

    public static void main(String[] args) {
        

          // if(i>=0)
        //     first=a.charAt(i)-'0';
        // if(j>=0)
        //     second=a.charAt(j)-'0';

        String str="12";
        int first=0;
        first=str.charAt(0)-'0';
        //System.out.println(str.charAt(0));
        System.out.println(first);

        System.out.println(Character.getNumericValue(str.charAt(0)));
    }
    
}
