package com.sagar.practice.day7.subsequence;

import java.util.ArrayList;


public class SubSequence {


    public static void main(String[] args) {
        String str="abc";
        String ans="";
        ArrayList<String> res=new ArrayList<>();
       printSubSequence(str, 0, ans,res);
       System.out.println(res);
    }


    //inclusion and exculsion pattern
    
    public static void printSubSequence(String str,int index, String ans,ArrayList<String> res)
    {
            if(index==str.length())
            {
                res.add(ans);
                return;
            }

            //include ki call
            printSubSequence(str, index+1, ans+str.charAt(index),res);
            

            //exclude ki call
            printSubSequence(str, index+1, ans,res);
    }

      
}
