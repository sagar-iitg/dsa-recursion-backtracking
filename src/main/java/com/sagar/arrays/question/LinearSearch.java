package com.sagar.arrays.question;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr={1,2,10,20,7,65};
        int target=65;
        boolean ans = solve(arr, target, 0);
        System.out.println(ans);
    }

    private static boolean solve(int[] arr, int target,int index) {

        if(index==arr.length) return false;

        //if (arr[index]==target) return true;
        return arr[index]==target || solve(arr,target,index+1);
    }
}
