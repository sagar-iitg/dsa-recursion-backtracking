package com.sagar.subset.problems;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    


    public static void main(String[] args) {


        String str="abcd";
        //method 1
        subseq("", str);

        //method 2

        List<String> ans=new ArrayList<>();
        subseq("", str,ans);
        System.out.println(ans);

        //method 3
        System.out.println(subSeqReturn("", str));
        

    }


    private static void subseq(String p,String up,List<String> ans)
    {
        if(up.isEmpty())
        {
            //System.out.println(p);
            ans.add(p);
            return;
        }

        char ch=up.charAt(0);

        //include
        subseq(p+ch, up.substring(1),ans);
        //exclude
        subseq(p, up.substring(1),ans);

    }
    private static void subseq(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

         char ch=up.charAt(0);

        //include
        subseq(p+ch, up.substring(1));
        //exclude
         subseq(p, up.substring(1));

    }



    //diffcult one creating inside --
    static ArrayList<String> subSeqReturn(String p,String up)
    {
        if(up.isEmpty())
        {
         

                ArrayList<String> list=new ArrayList<>();
                list.add(p);
                return list;

        }

         char ch=up.charAt(0);

         ArrayList<String> right=subSeqReturn(p+ch, up.substring(1));
         ArrayList<String> left=subSeqReturn(p, up.substring(1));

         right.addAll(left);
         return right;



    }
}
