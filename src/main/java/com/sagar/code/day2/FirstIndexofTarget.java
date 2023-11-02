package com.sagar.code.day2;

public class FirstIndexofTarget {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 3, 4, 0, 0, 0 };
        int target = 0;
        solve(arr, target, 0, arr.length);
        // System.out.println(ans);
    }

    static void solve(int[] arr, int target, int index, int size) {

        if (index == size) {
            System.out.println("Not found");
            return;
        }
        if (arr[index] == target) {
            System.out.println(index);
            return;
        }

        solve(arr, target, index + 1, size);
        // return -1;

    }

}
