package day2;

public class ArrayExample1 {


    public static void main(String[] args) {
        
        int[] arr={10,2,3,4,0};
        printArray(arr, 0);
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
