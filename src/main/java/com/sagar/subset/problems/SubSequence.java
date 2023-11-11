package com.sagar.subset.problems;

import java.util.ArrayList;

public class SubSequence {
    


    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(subSeqReturn("", "abc"));
        

    }

    
    static void subseq(String ans,String str)
    {
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }

         char ch=str.charAt(0);
         subseq(ans, str.substring(1));
         subseq(ans+ch, str.substring(1));
       


    }



    static ArrayList<String> subSeqReturn(String ans,String str)
    {
        if(str.isEmpty())
        {
         

                ArrayList<String> list=new ArrayList<>();
                list.add(ans);
                return list;

        }

         char ch=str.charAt(0);
         ArrayList<String> left=subSeqReturn(ans, str.substring(1));
         ArrayList<String> right=subSeqReturn(ans+ch, str.substring(1));
         left.addAll(right);
         return left;



    }
}
