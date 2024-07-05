package com.sagar.dp.basic;

public class HouseRobber{

    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        int ans=solve(arr,0);
        System.out.println(ans);
    }
    private static int solve(int[] nums,int index){


        //base case
        if(index>nums.length-1){
            return 0;
        }
        //int p=0

        int include=solve(nums,index+2)+nums[index];
        int exclude=solve(nums,index+1);
        return Math.max(include,exclude);



    }
}
