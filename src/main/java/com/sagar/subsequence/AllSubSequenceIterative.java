package com.sagar.subsequence;

import java.util.ArrayList;
import java.util.List;

public class AllSubSequenceIterative {
    public static void main(String[] args) {
        String str = "abc";
        List<String> ans = getAllSubsequences(str);
        System.out.println(ans);
    }

    public static List<String> getAllSubsequences(String str) {
        List<String> ans = new ArrayList<>();
        int n = str.length();

        // There are 2^n possible subsequences
        int totalSubsequences = 1 << n; // This is 2^n

        // Iterate through all numbers from 0 to 2^n - 1
        for (int i = 0; i < totalSubsequences; i++) {
            StringBuilder subsequence = new StringBuilder();

            // Check each bit of i
            for (int j = 0; j < n; j++) {
                // If the j-th bit is set, include str[j] in the subsequence
                if ((i & (1 << j)) != 0) {
                    subsequence.append(str.charAt(j));
                }
            }

            // Add the generated subsequence to the result
            ans.add(subsequence.toString());
        }

        return ans;
    }
}
