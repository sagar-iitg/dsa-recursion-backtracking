package com.sagar.arrays.question;

public class RotatedSearch {

    public static void main(String[] args) {
        int[] arr={3,1};
        int target=1;
        int ans=solve(arr,target,0,arr.length-1);
        System.out.println(ans);

    }

    private static int solve(int[] arr, int target, int start,int end) {
       int mid=(start+end)>>>1;

       //base case
       if(start>end) return -1;

       if(arr[mid]==target) return mid;

       //left part is sorted
       if(arr[start]<=arr[mid])
       {
           if(arr[start]<=target && arr[mid]>target)
           {
               return solve(arr,target,start,mid-1);
           }else{
               return solve(arr,target,mid+1,end);
           }


       }
       //right part is sorted
       else{
           if(arr[end]>=target && arr[mid]<target)
           {
               return solve(arr,target,mid+1,end);
           }else{
               return solve(arr,target,start,mid-1);
           }

       }


    }
}
