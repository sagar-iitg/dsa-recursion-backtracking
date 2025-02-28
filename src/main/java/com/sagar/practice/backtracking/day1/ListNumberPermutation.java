package com.sagar.practice.backtracking.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNumberPermutation {

    public static void main(String[] args) {

        int[] nums={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        permutation(nums,ans,0);
        ans.forEach(System.out::println);
    }

    private static void permutation(int[] nums,List<List<Integer>> ans,int index){


        if(index==nums.length){
            ans.add(Arrays.stream(nums).boxed().toList());
            return;
        }

        for(int j=index;j<nums.length;j++){
            swap(nums,index,j);
            permutation(nums,ans,index+1);
            //backtrack
            swap(nums,index,j);

        }
    }
    private static  void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
