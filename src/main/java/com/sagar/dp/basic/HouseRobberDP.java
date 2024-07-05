package com.sagar.dp.basic;

import java.util.Arrays;

public class HouseRobberDP {

    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        int[] dp=new int[arr.length+1];
        Arrays.fill(dp,-1);

        int ans=solve(arr,0,dp);
        System.out.println(ans);
        System.out.println(Arrays.toString(dp));
    }
    private static int solve(int[] nums,int index,int[] dp){


        //base case
        if(index>nums.length-1){
            return 0;
        }
       if(dp[index]!=-1) return dp[index];

        int include=solve(nums,index+2,dp)+nums[index];
        int exclude=solve(nums,index+1,dp);
        return dp[index]=Math.max(include,exclude);



    }
}
