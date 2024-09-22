package com.sagar.code.day7;

public class LIS {


    public static void main(String[] args) {
        

        int[] arr={0,1,0,3,2,3};
        int n=arr.length;

        int curr=0;
        int prev=-1;
        int ans=solve(arr,n,curr,prev);
        System.out.println(ans);


    }
    static int solve(int[] arr,int n,int curr,int prev)
    {


        if(curr==n)
            return 0;
        
        //include
        
        int pick=0;
        if(prev==-1 || arr[curr]>arr[prev])
        {

            pick=1+solve(arr,n,curr+1,curr);

        }

        //exclude
        int notpick=0+solve(arr, n, curr+1, prev);  


        return Math.max(pick, notpick);

    }
    
}
