package com.sagar.dp.basic;

import java.util.Arrays;

public class FiboDPBottomUp {

    public static void main(String[] args) {
        int n=6;
        int ans=fibo(n);
        System.out.println(ans);

    }

    static int fibo(int n){
        int[] dp=new int[n+1];

        //base case
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return  dp[n];
    }
}
