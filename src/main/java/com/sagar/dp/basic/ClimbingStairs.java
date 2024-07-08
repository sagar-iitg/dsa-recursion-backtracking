package com.sagar.dp.basic;

public class ClimbingStairs {
    public static void main(String[] args) {
        int ans=solve(44);
        System.out.println(ans);
        int ans1=solve1(44,0);
        System.out.println(ans1);
        int a=3/4;
        System.out.println(a);
    }

    public static int solve(int n) {
        if(n<0) return 0;
        if(n==0) return 1;
        int left=solve(n-1);
        int right=solve(n-2);
        return left+right;

    }
    public  static int solve1(int n,int i){

        if(i==n) return 1;
        if(i>n) return 0;
        return solve1(n,i+1)+solve1(n,i+2);
    }
}
