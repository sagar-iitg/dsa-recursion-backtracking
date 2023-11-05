package com.sagar.sort;

import java.util.Arrays;

public class IterativeSelectionSort {
    public static void main(String[] args) {

        int[] arr={4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

        int n=arr.length;
        for(int i=0;i<n;i++)
        {
           int index=maxIndexArray(arr,n-1-i);
           swap(arr,index,n-1-i);

        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    private static int maxIndexArray(int[] arr, int end) {
        int index=-1;

        int max=Integer.MIN_VALUE;
        for(int i=0;i<=end;i++){
            if(max<arr[i])
            {
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
}
