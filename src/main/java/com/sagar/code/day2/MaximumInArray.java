package com.sagar.code.day2;

public class MaximumInArray {

    public static void main(String[] args) {
        int arr[] = { 1, 23, 0, 9 };

        System.out.println(getMax(arr, arr.length, 0));

    }

    private static int getMax(int[] arr, int size, int index) {

        if (index == size) {
            return Integer.MIN_VALUE;
        }
        int mera_ans = arr[index];
        int rec_ans = getMax(arr, size, index + 1);
        int final_ans = Math.max(mera_ans, rec_ans);

        return final_ans;

    }

}
