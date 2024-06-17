package com.sagar.subsequence;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceList {

    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        subsequence(arr,0,ans,new ArrayList<Integer>());
        System.out.println(ans);
    }

    private static void subsequence(int[] arr, int index, List<List<Integer>> ans,ArrayList<Integer> temp)  {

        if(index==arr.length){
            System.out.println(temp);
            ans.add(new ArrayList<>(temp));
            return;

        }


        //include
        temp.add(arr[index]);
        subsequence(arr,index+1,ans,temp);

        //exclude
        temp.remove(Integer.valueOf(arr[index]));
        subsequence(arr,index+1,ans,temp);


    }
}
