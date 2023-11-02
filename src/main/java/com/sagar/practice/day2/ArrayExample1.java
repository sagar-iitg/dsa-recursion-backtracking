package com.sagar.practice.day2;

public class ArrayExample1 {


    
    public static void main(String[] args) {
        
        int[] arr={-10000,2,3,4,1000,-5,-2,2000};
        //printArray(arr, 0);
        //reverse(arr, 0);
       // reverse1(arr, arr.length-1);
    //    int res=max(arr, 0,arr[0]);
    //    System.out.println(res);
        System.out.println(getMax(arr, 0));

    }

    static int getMax(int arr[],int index)
    {
        if(index==arr.length)
        {
            return Integer.MIN_VALUE;
        }
        
        int ans=arr[index];
        int recAns=getMax(arr,index+1);
        //return ans>recAns?ans:recAns;
        return Math.max(ans, recAns);




    }
    


    static int max(int arr[],int index,int max)
    {
        if(arr.length==index)
            return max;
        
        if(arr[index]>max)
            max=arr[index];
        return max(arr,index+1,max);

        

    }

    static void reverse(int[] arr,int index)
    {

        if(arr.length==index)
            return;
        reverse(arr, index+1);
        System.out.print(arr[index]+" ");
    }
    static void reverse1(int[] arr,int index)
    {

        if(index==-1)
            return;
        System.out.print(arr[index]+" ");

        reverse1(arr, index-1);
      
    }

    static void printArray(int[] arr,int index)
        {
            if(index==arr.length)
                return;


                System.out.print(arr[index]+" ");
                printArray(arr, index+1);
                //printArray(arr,++index);
        }
    
}
