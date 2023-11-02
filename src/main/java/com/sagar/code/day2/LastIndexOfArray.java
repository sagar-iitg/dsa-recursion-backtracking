package com.sagar.code.day2;

public class LastIndexOfArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 0, 3, 7, 4, 0, 0, 0 };
        int target = 0;
        int ans = solve(arr, target, arr.length - 1, arr.length);
        System.out.println(ans);
    }

    static public int solve(int[] arr, int target, int index, int size) {

        if (index == 0) {
            // System.out.println("Not found");
            return -1;
        }
        if (arr[index] == target) {
            // System.out.println(index);
            return index;
        }

        return solve(arr, target, index - 1, size);
        // return -1;

    }

}
