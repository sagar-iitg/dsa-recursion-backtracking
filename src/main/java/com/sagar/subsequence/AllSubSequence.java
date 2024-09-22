package com.sagar.subsequence;

import java.util.ArrayList;
import java.util.List;

public class AllSubSequence {
    public static void main(String[] args) {
        String str="abc";
        List<String> ans=new ArrayList<>();
        solve(str,new StringBuilder(),0,ans);
        System.out.println(ans);
    }

    private static void solve(String str, StringBuilder output, int index, List<String> ans) {

            //base case
           if(str.length()==index){
               ans.add(output.toString());
               return;
           }
           //include
         solve(str,output.append(str.charAt(index)),index+1,ans);
         output.deleteCharAt(output.length() - 1);  // Backtrack
           //exclude
         solve(str,output,index+1,ans);


    }
}
