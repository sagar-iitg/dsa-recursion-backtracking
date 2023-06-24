package day1;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    

    public static void main(String[] args) {
       // System.out.println("hello");
        List<String> output=new ArrayList<>();

        String str="abcd";
        
        printAllPermutation(0,output,str.toCharArray());
        output.stream().forEach(System.out::println);
        




    }

    private static void printAllPermutation(int index, List<String> output, char[] charArray) {


        if(index==charArray.length)
        {
            output.add(String.valueOf(charArray));
            return;
        }


        for(int j=index;j<charArray.length;j++)
        {
            swap(charArray,index,j);
            printAllPermutation(index+1, output, charArray);
            //backtrack
            swap(charArray, index, j);

            
        }
    }

    private static void swap(char[] charArray, int i, int j) {

        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
    }
    
}
