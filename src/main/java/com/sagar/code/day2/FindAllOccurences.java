package com.sagar.code.day2;

import java.util.*;

public class FindAllOccurences {

    static ArrayList<Integer> ans = new ArrayList<>();
    // static int i = 0;

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 0, 3, 7, 4, 0, 0, 0 };
        int target = 7;
        solve(arr, target, 0, arr.length, ans);
        System.out.println(ans);
    }

    static public void solve(int[] arr, int target, int index, int size, ArrayList<Integer> ans) {

        if (index == size) {
            // System.out.println("Not found");
            return;
        }
        if (arr[index] == target) {
            // System.out.println(index);
            ans.add(index);
            // i++;
        }

        solve(arr, target, index + 1, size, ans);
        // return -1;

    }
}
