package day7.subsequence;

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
    
    static void printSubSequence(String str,int index, String ans,ArrayList<String> res)
    {

            if(index==str.length())
            {
                //System.out.println(ans);
                res.add(ans);
                return;
            }


            printSubSequence(str, index+1, ans+str.charAt(index),res);
            
            printSubSequence(str, index+1, ans,res);
    }

      
}
