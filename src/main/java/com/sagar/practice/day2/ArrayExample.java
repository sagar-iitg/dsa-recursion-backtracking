package com.sagar.practice.day2;

import java.util.ArrayList;

public class ArrayExample {


    static ArrayList<Integer> ans2=new ArrayList<>();

    public static void main(String[] args) {
        
        int[] arr={10 ,2,3};
        ArrayList<Integer> ans=new ArrayList<>();
        printArrayMethod1(arr,0,ans);
        System.out.println(ans);
        

    }
        //tail recursion --bcz function call is at end in printArray method
    private static void printArrayMethod1(int[] arr,int index,ArrayList<Integer> ans)
    {
        //base case
        if(arr.length==index)
        {
            
            return;
        }
        ans.add(arr[index]);
        printArrayMethod1(arr, index+1,ans);

      

    }

    
}
