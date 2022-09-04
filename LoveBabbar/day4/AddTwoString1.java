package day4;

import java.util.ArrayList;
import java.util.Collections;

public class AddTwoString1 {


    static ArrayList<String> ans=new ArrayList<>();
    public static void main(String[] args) 
    {
        
        String str1="743888";
        String str2="343";
        //String ans="";
        solve(str1,str2,0,str1.length()-1,str2.length()-1);
        Collections.reverse(ans);
        for (String i: ans) {
            System.out.print(i);
            
        }
        System.out.println();
        System.out.println(ans);




    }

    static void solve(String a,String b,int c,int i,int j)
    {
        if(i<0 && j<0 && c==0)
        {

            return;
        }


        int first=0;
        int second=0;
        if(i>=0)
            first=Character.getNumericValue(a.charAt(i));

        if(j>=0)
            second=Character.getNumericValue(b.charAt(j));

        
        int sum=first+second+c;
        int lastDigit=sum%10;
        c=sum/10;
        ans.add(lastDigit+"");
        solve(a, b, c, i-1, j-1);




    }
    
}
