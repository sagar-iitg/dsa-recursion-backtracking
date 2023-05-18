package day2;

public class MaxInArray {

    static int maxi=Integer.MIN_VALUE;
   
    public static void main(String[] args) {
       
        int[] arr={-10000,2,3,4,1000,-5,-2,2000};
        System.out.println(getMax(arr, 0));
        System.out.println(getMax1(arr, 0,arr[0]));
        getMax2(arr,0,MaxInArray.maxi);
        System.out.println(MaxInArray.maxi);

     

    }


    static void getMax2(int arr[],int index,int maxi)
    {
        if(arr.length==index)
            return;
        
        MaxInArray.maxi=Math.max(maxi,arr[index]);
        getMax2(arr,index+1,maxi);

        

    }

    static int getMax1(int arr[],int index,int max)
    {
        if(arr.length==index)
            return max;
        
        if(arr[index]>max)
            max=arr[index];
        return getMax1(arr,index+1,max);

        

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
    
}
