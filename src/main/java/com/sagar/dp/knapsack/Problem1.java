package com.sagar.dp.knapsack;

import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {
        
         
        int weight[]={4,5,1};
        int values[]={1,2,3};
        int n=3;
        int capacity=4;
        int[][] dp=new int[n][capacity+1];
          for (int[] is : dp) {
             Arrays.fill(is, -1);
        }

        //int ans=solveUsingRecursion(weight,values,n-1,capacity);
        int ans1=solveUsingMem(weight,values,n-1,capacity,dp);
        System.out.println(ans1);


    }

    //index here =index of last element
    static int solveUsingRecursion(int weight[],int values[],int index,int capacity)
    {
        
        //base case  -> only one item
        if(index==0)
        {
            
            if(weight[0]<=capacity)
                return values[0];
            
            else{
                return 0;
            }

        }

        //include and exclude

        int include=0;
        if(weight[index]<=capacity)
            include=values[index]+solveUsingRecursion(weight, values, index-1, capacity-weight[index]);
        
        int exclude=0+solveUsingRecursion(weight, values, index-1, capacity);

        int ans=Math.max(include, exclude);
        return ans;


    }

    

     //index here =index of last element
    static int solveUsingMem(int weight[],int values[],int index,int capacity,int[][] dp)
    {
        
        //base case  -> only one item
        if(index==0)
        {
            
            if(weight[0]<=capacity)
                return values[0];
            
            else{
                return 0;
            }

        }

        //include and exclude

        if(dp[index][capacity]!=-1)
            return dp[index][capacity];
        

        int include=0;
        if(weight[index]<=capacity)
            include=values[index]+solveUsingMem(weight, values, index-1, capacity-weight[index],dp);
        
        int exclude=0+solveUsingMem(weight, values, index-1, capacity,dp);

        dp[index][capacity]=Math.max(include, exclude);
        return dp[index][capacity];



    }

}
