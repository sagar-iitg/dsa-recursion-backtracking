package com.sagar.arrays.question;

import java.util.ArrayList;

public class LinearSearch3 {

    static ArrayList<Integer> ans=new ArrayList<>();
    public static void main(String[] args) {

        int[] arr={1,2,65,20,7,65};
        int target=65;
        var ans=findAllIndex(arr, target, 0);
        System.out.println(ans);
    }


    //difficult one -- focus this
    //Do not use this approach every time we are creating list in each function call
    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        var list=new ArrayList<Integer>();
        if(index==arr.length) return list;

        if (arr[index]==target) {
            list.add(index);
        }
        var ansFromBelowCalls=findAllIndex(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
