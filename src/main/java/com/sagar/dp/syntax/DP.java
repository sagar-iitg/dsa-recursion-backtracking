package com.sagar.dp.syntax;

import java.util.Arrays;

public class DP {
    

    public static void main(String[] args) {
        int[][] dp=new int[3][3];
        System.out.println(Arrays.deepToString(dp));
        for (int[] is : dp) {
             Arrays.fill(is, -1);
        }
       
        System.out.println(Arrays.deepToString(dp));

        int[] dp1=new int[10];
        Arrays.fill(dp1,-1);
        System.out.println(Arrays.toString(dp1));
        
    }
}
