package com.sagar.supreme;

public class LIS {

    public static void main(String[] args) {
        int[] arr={10,9,15,20};
        int curr=0;
        int prev=-1;
        int n=arr.length;
        int ans=solve(arr,curr,prev,n);
        System.out.println(ans);

    }

    private static  int solve(int[] arr,int curr,int prev,int n){



        if(curr==n) return 0;

        int include=0;
        //prev=-1 means no element is added in result
        if(prev==-1 || arr[curr]>arr[prev]){
               //System.out.println("solve include"+curr+" "+prev);
                include=1+solve(arr,curr+1,curr,n);
        }
        //exclude
     //   int exclude=0;
        //System.out.println("solve exclude"+curr+" "+prev);
        int exclude= solve(arr, curr + 1, prev,n);

        return Math.max(include,exclude);

    }
}
