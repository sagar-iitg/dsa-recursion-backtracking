package day2;

import java.util.ArrayList;

public class ArrayExample {


    static ArrayList<Integer> ans2=new ArrayList<>();

    public static void main(String[] args) {
        
        int[] arr={10 ,2,3};
        ArrayList<Integer> ans=new ArrayList<>();
        printArrayMethod1(arr,0,ans);
        printArrayMethod2(arr,0);
        System.out.println(ans);
        System.out.println(ans2);
        

    }
        //tail recursion --bcz function call is at end in printArray method


        static ArrayList<Integer> printArrayMethod2(int[] arr,int index)
        {
            if(index==arr.length)
                return ans2;


                ans2.add(arr[index]);
                return printArrayMethod2(arr,index+1);
        }
      
        
        //tail recursion --bcz function call is at end in printArray method
    private static void printArrayMethod1(int[] arr,int index,ArrayList<Integer> ans)
    {
        //base case
        if(arr.length==index)
        {
            
            return;
        }
        ans.add(arr[index]);
        printArrayMethod1(arr, index+1,ans);

      

    }

    
}
