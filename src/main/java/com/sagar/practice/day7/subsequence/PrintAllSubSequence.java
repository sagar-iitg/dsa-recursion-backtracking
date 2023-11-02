package com.sagar.practice.day7.subsequence;

import java.util.ArrayList;

public class PrintAllSubSequence {

    static ArrayList<String> res=new ArrayList<>();
    public static void main(String[] args) {
        String str="abcd";
        printSubsequence(str,"");
        System.out.println(res);
    }
private static void printSubsequence(String str, String ans) {

    if(str.length()==0)
    {
        res.add(ans);
        return;
    }
    printSubsequence(str.substring(1),ans+str.charAt(0));
    printSubsequence(str.substring(1),ans);



    }

    
}
