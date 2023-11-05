package com.sagar.dp;

import java.util.Arrays;

public class DP {
    

    public static void main(String[] args) {
        int[][] dp=new int[3][3];
        System.out.println(Arrays.deepToString(dp));
        for (int[] is : dp) {
             Arrays.fill(is, -1);
        }
       
        System.out.println(Arrays.deepToString(dp));
        
    }
}
