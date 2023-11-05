package com.sagar.arrays.question;

import java.util.ArrayList;

public class LinearSearch2 {

    static ArrayList<Integer> ans=new ArrayList<>();
    public static void main(String[] args) {

        int[] arr={1,2,65,20,7,65};
        int target=65;
        findAllIndex(arr, target, 0);
        System.out.println(ans);
    }

    private static void findAllIndex(int[] arr, int target, int index) {

        if(index==arr.length) return;

        if (arr[index]==target) {
            ans.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
}
