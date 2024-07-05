package com.sagar.dp.basic;

public class ClimbingStairs {
    public static void main(String[] args) {
        int ans=solve(44);
        System.out.println(ans);
    }

    public static int solve(int n) {
        if(n<0) return 0;
        if(n==0) return 1;
        int left=solve(n-1);
        int right=solve(n-2);
        return left+right;

    }
}
