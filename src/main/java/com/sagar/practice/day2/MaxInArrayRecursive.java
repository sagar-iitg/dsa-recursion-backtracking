package com.sagar.practice.day2;

public class MaxInArrayRecursive {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 15, 10};
        int max = findMax(arr, 0, arr.length - 1);
        System.out.println("The maximum element in the array is: " + max);
    }

    // Recursive function to find the maximum element in the array
    private static int findMax(int[] arr, int start, int end) {
        // Base case: If there's only one element, it's the maximum
        if (start == end) {
            return arr[start];
        }

        // Find the middle index of the current subarray
        int mid = (start + end) >>>1;

        // Recursively find the maximum in the left and right subarrays
        int leftMax = findMax(arr, start, mid);
        int rightMax = findMax(arr, mid + 1, end);

        // Compare and return the maximum of the left and right subarrays
        return Math.max(leftMax, rightMax);
    }
}
