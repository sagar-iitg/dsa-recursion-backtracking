package com.sagar.basics;

public class CountZeros {

    public static void main(String[] args) {
        
        int res=count(10000);
        System.out.println(res);
    }

    private static int count(int n) {
        if(n==0) return 1;
        
        return helper(n,0);
    }

    private static int helper(int n, int count) {
        if(n==0)
            return count;

        int rem=n%10;
        if(rem==0) return helper(n/10,count+1);
        return helper(n/10,count);
    }
}
