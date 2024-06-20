package com.sagar.subsequence;

import java.util.ArrayList;

public class PrintSubsequenceWhoseSumisK {

    public static void main(String[] args) {
        int[] arr={17, 18, 6, 11, 2, 4};
        int sum=6;
        solve(arr,0,sum,0,new ArrayList<Integer>());
    }

    private static void solve(int[] arr, int index, int sum, int s,ArrayList<Integer> temp) {
        if(index==arr.length)
        {
            if(s==sum){
                System.out.println(temp);
               // System.exit(0);

            }
            return;
        }
        //include
        temp.add(arr[index]);
        s=s+arr[index];
        solve(arr,index+1,sum,s,temp);
        //exclude
        temp.remove(Integer.valueOf(arr[index]));
        s=s-arr[index];
        solve(arr,index+1,sum,s,temp);


    }
}


