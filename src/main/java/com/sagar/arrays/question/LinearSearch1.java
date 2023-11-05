package com.sagar.arrays.question;

import java.util.ArrayList;

public class LinearSearch1 {

    public static void main(String[] args) {

        int[] arr={1,2,65,20,7,65};
        int target=65;
        var ans=findAllIndex(arr, target, 0,new ArrayList<>());
        System.out.println(ans);
    }

    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {

        if(index==arr.length) return list;

        if (arr[index]==target) {
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
}
