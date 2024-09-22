package com.sagar.code.day7;

public class IsSubsequence {


    public static void main(String[] args) {
        
        String str1="abcd";
        String str2="abd";

       int count= solve(str1,0,str2,0);
       System.out.println(count);
    }

    private static int  solve(String s1,int index1,String s2,int index2)
    {

        //Base case
        if(s2.length()==index2)
            return 0;

        if(s1.charAt(index1)==s2.charAt(index2))
        {
            return 1+solve(s1, index1+1, s2, index2+1);

        }

        return solve(s1, index1+1, s2, index2);
    }
    
}
