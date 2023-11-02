package com.sagar.practice.day1;

public class PrintExample{


    public static void main(String[] args) {
        printIncreasingOrder(7);
         System.out.println();
        printDecreasingOrder(4);
        System.out.println();
        bothSidePrint(6);
        System.out.println();
        bothSidePrintReverse(3);
        System.out.println();
        int[] arr={1,2,4,5,0,101};
        printArray(arr,0);

    }

    //tail recursion
    static void printArray(int[] arr,int index)
    {
        if(index==arr.length)
            return;

        System.out.print(arr[index]+" ");
        printArray(arr, index+1);
    }
    static void bothSidePrint(int n)
    {

        if(n==0)
            return;
        
        System.out.print(n+" ");
        bothSidePrint(n-1);
        System.out.print(n+" ");
 
      
    }
    static void bothSidePrintReverse(int n)
    {

        printIncreasingOrder(n);
       printDecreasingOrder(n);
     
 
      
    }
    static void printIncreasingOrder(int n)
    {

        if(n==0)
            return;
        printIncreasingOrder(n-1);
        System.out.print(n+" ");
       // System.out.println();
    }
    //tail recursion
    static void printDecreasingOrder(int n)
    {
        if(n==0)
            return;
            //ek case hum solve kar dega
        System.out.print(n+" ");
        //rest recursion will take care of it
        printDecreasingOrder(n-1);
        //System.out.println();
    }
    
}
