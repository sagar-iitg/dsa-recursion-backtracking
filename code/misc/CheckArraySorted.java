package misc;

public class CheckArraySorted {

    public static void main(String[] args) 
    {
        int arr[]={1,2,3,5,6,0};
        boolean ans=solve(arr,0,arr.length-1);
        System.out.println(ans);


    }

  

    private static boolean solve(int [] arr,int index,int size)
    {
          if(index==size){
            return true;
          }

            return arr[index] < arr[index+1] &&  solve(arr, index+1, size);

    }
    
}
