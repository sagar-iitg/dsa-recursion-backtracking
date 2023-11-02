package com.sagar.practice.day7.subsequence;

public class IsSubSequence {

    public static void main(String[] args) {
        String s="abc";
        String t="ahbgd";
        boolean ans=solve(s,t);
        System.out.println(ans);
    }
    private static boolean solve(String s,String t)
    {

        int i=0;
        int j=0;
        for(int k=0;k<t.length();k++)
        {       if(i<s.length())
            {
                 if(s.charAt(i)==t.charAt(j))
                {
                    i++;
                    j++;

                }
                else{
                    j++;
                }
            }
               
        }
        return i==s.length();
    }
    
}
