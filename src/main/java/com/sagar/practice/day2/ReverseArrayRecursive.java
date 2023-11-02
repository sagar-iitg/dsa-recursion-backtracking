package com.sagar.practice.day2;

public class ReverseArrayRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr, 0, arr.length - 1);
        System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int[] arr1 = {1, 2, 3, 4, 5};

        int[] reversedArray = reverseArrayReturnArray(arr1, 0, arr.length - 1);
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }

    //both method do not create new array in heap->inplace algorithm

    // Recursive function to reverse an array
    public static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            // Swap the elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Recursive call to reverse the rest of the array
            reverseArray(arr, start + 1, end - 1);
        }
    }
    public static int[] reverseArrayReturnArray(int[] arr, int start, int end) {
        if (start >= end) {
            return arr; // Return the reversed array
        }

        // Swap the elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively reverse the rest of the array
        return reverseArrayReturnArray(arr, start + 1, end - 1);
    }
}
