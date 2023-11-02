package com.sagar.practice.day4.string;

public class ReverseString {


    public static void main(String[] args) {
        
        String str="sagar";
        solve(str.toCharArray(),0);

    }
    public static void solve(char[]  ch,int index)
    {
  
            if(index==ch.length)
                return;
            
            char temp=ch[index];
            solve(ch, index+1);
            System.out.print(temp+" ");

                        
    }

  
    
   
    
}
