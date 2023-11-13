package com.sagar.sort;

import java.util.Arrays;


public class MergeSort2 {

    public static void main(String[] args) {
        int[] arr={-1,-9,0,230,10,9,1,3,45,3,2,20,30,40,50};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr,int start,int end) {

            if(start==end) return;

            int mid=(start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);





    }

    private static void merge(int[] arr,int start,int mid,int end) {

            int[] left=Arrays.copyOfRange(arr,start,mid+1);
            int[] right=Arrays.copyOfRange(arr,mid+1,end+1);
           int i=0;
           int j=0;
           int k=start;
           while(i<left.length && j<right.length)
           {
               if(left[i]<right[j])
               {
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
           while (i<left.length)
           {
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
