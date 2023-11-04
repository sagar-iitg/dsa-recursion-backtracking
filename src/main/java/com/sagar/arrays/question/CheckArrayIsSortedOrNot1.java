package com.sagar.arrays.question;

public class CheckArrayIsSortedOrNot1 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        boolean ans=sortedArray(arr,0);
        System.out.println(ans);
    }

    private static boolean sortedArray(int[] arr, int index) {
        if (index == arr.length-1) return true;

        //short-circuiting
      return arr[index] <=arr[index + 1] && sortedArray(arr, index + 1);

    }


}
