package com.sagar.dp.basic;

import java.util.Arrays;

public class MaximumSumNoAdjacentElementBootomUp {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 10, 7};
        int ans = solve(arr);
        System.out.println(ans);

    }

    private static int solve(int[] arr) {

        int[] dp = new int[arr.length+2];
        Arrays.fill(dp, 0);
        for(int i=arr.length-1;i>=0;i--){
            int include=dp[i+2]+arr[i];
            int exclude=dp[i+1];
            dp[i]= Math.max(include,exclude);
        }
        return dp[0];

    }
}