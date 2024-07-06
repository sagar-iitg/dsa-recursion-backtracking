package com.sagar.dp.basic;

import java.util.Arrays;

public class FiboDP{

    public static void main(String[] args) {
        int n=6;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=fibo(n,dp);
        System.out.println(ans);
        System.out.println(Arrays.toString(dp));
    }

    static int fibo(int n,int[] dp){
        if(n==0) return 0;
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];

        return  dp[n] =fibo(n-1,dp)+fibo(n-2,dp);
    }
}
