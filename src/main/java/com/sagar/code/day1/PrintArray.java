package com.sagar.code.day1;

public class PrintArray {

    public static void main(String[] args) {

        int[] arr = { 10, 25, 4, 5, 19 };

        print(arr, arr.length, 0);

    }

    static void print(int[] arr, int size, int index) {

        // base case
        if (index == size) {
            return;

        }
        // ek case solve
        System.out.print(arr[index] + " ");

        // recursive call-- rest recursion will do
        // only solve one(ek) case
        print(arr, size, ++index);

    }

}
