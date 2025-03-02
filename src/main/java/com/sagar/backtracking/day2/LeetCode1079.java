package com.sagar.backtracking.day2;

import java.util.*;

public class LeetCode1079 {
    public static void main(String[] args) {
        String str="XPYP";
        Set<String> subset=new HashSet<>();
        generateSubSet(str,subset,"",0);
        System.out.println(subset);
        Set<Set<String>> ans=new HashSet<>();
        for(String i:subset){
            Set<String> permuation=new HashSet<>();
            permuationOfEachSubSet(i.toCharArray(),permuation,0);
            ans.add(permuation);
        }
        System.out.println(ans);
        System.out.println(ans.stream().mapToInt(Set::size).sum());

    }

    private static void generateSubSet(String str,Set<String> subset,String temp,int index) {

            if(index==str.length()){
                if(!temp.isEmpty()) subset.add(temp);
                return;
            }
            //pick
        generateSubSet(str,subset,temp+str.charAt(index),index+1);
            //not pick
        generateSubSet(str,subset,temp,index+1);
    }

   static void permuationOfEachSubSet(char[] ch, Set<String> permuation, int index){
        if(index==ch.length){
            permuation.add(new String(ch));
            return;
        }
        for(int j=index;j<ch.length;j++){
            swap(ch,j,index);
            permuationOfEachSubSet(ch,permuation,index+1);
            //backtrack
            swap(ch,j,index);
        }
   }
   private  static  void swap(char[] ch,int x,int y){
        char temp=ch[x];
        ch[x]=ch[y];
        ch[y]=temp;
   }
}
