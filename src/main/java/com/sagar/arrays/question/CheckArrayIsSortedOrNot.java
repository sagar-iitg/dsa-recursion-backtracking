package com.sagar.arrays.question;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {

        int[] arr={1,2,10,4,5};
        boolean ans=sortedArray(arr,0);
        System.out.println(ans);
    }

    private static boolean sortedArray(int[] arr, int index) {
        if (index == arr.length-1) return true;

        if (index<=arr.length-2 && arr[index] <=arr[index + 1]) return sortedArray(arr, index + 1);
        else return false;
    }


}
