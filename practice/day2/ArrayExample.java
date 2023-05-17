package day2;



public class ArrayExample {

    public static void main(String[] args) {
        
        int[] arr={1,2,3};
        printArray(arr,0);
    }

    static void printArray(int[] arr,int index)
    {
        //base case
        if(arr.length==index)
        {
            return;
        }
        System.out.print(arr[index]+" ");
        printArray(arr, index+1);

    }

    
}
