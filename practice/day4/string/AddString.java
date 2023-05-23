package day4.string;

import java.util.ArrayList;
import java.util.Collections;

public class AddString {

    public static void main(String[] args) {
        

        String a="43";
        String b="343";
        //String ans="";
        ArrayList<String> ans=new ArrayList<>();
        solve(a, b, 0, ans, a.length()-1, b.length()-1);
        Collections.reverse(ans);
        for (String string : ans) {
            System.out.print(string);
        }
        System.out.println();
        System.out.println(ans);

    }
    static void solve(String a,String b,int carry,ArrayList<String> ans,int i,int j)
    {

        if(  i<0 && j<0 && carry==0)
            return;
        
        int first=0,second=0;
        // if(i>=0)
        //     first=a.charAt(i)-'0';
        // if(j>=0)
        //     second=a.charAt(j)-'0';
        
        if(i>=0)
        first=Character.getNumericValue(a.charAt(i));

    if(j>=0)
        second=Character.getNumericValue(b.charAt(j));

        int sum=first+second+carry;
        int lastDigit=sum%10;
        carry=sum/10;
        ans.add(lastDigit+"");
        solve(a, b, carry, ans, i-1, j-1);

    }
    
}
