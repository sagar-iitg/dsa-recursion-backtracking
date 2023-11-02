package com.sagar.practice.day2;



public class FirstTarget {


    public static void main(String[] args) {
        int[] arr ={10,6,3,4,6,6,1,0};
        int res=solve(arr,0,25);
        System.out.println(res);
    }

    private static int solve(int[] arr, int index, int target)
    {


        if(index==arr.length)
            return -1;
        if(arr[index]==target)
            return index;
        
        return solve(arr, index+1, target);

    }
    
}
