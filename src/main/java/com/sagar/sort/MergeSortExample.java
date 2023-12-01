package com.sagar.sort;

import java.util.Arrays;

public class MergeSortExample {
    public static void main(String[] args) {
        int[] arr={10,9,1,3,45,3,2};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {

        //one element is present - one element is sorted
        //base condition
        if(start==end) return;
        int mid=start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,end);
    }

    private static void merge(int[] arr, int start, int end) {
        int mid=start+(end-start)/2;

        int[] left=Arrays.copyOfRange(arr,start,mid+1);
        int[] right=Arrays.copyOfRange(arr,mid+1,end+1);

        int i=0,j=0;
        int k=start;
        while (i<left.length && j<right.length)
        {
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k]=right[j];
                j++;
                k++;
            }

        }
        while (i<left.length){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }




    }
}
