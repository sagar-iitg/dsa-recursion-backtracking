package com.sagar.dp.basic;

import java.util.Arrays;

public  class MaximumSumNoAdjacentElement {
        public static void main(String[] args) {
            int[] arr={3, 2, 5, 10, 7};
            int[] dp=new int[arr.length+1];
            Arrays.fill(dp,-1);
            int ans=solve(arr,0,dp);
            System.out.println(ans);
            System.out.println(Arrays.toString(dp));
        }

        private static int solve(int[] arr,int index,int[] dp) {

            if(index>=arr.length){
                return 0;
            }
            if(dp[index]!=-1)
                return dp[index];
            int include=solve(arr,index+2,dp)+arr[index];
            int exclude=solve(arr,index+1,dp);
            return dp[index]= Math.max(include,exclude);

        }
    }