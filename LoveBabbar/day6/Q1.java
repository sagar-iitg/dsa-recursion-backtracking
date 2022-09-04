
package day6;


public class Q1{

    public static void main(String[] args) {
        int arr[]={1,9,7,100,64,33,0};

        solve(arr,arr.length);
    }

    private static void solve(int[] arr,int size){
        //Base Case
        if(size<=1){
            System.out.println(arr[0]);
            return;
        }
        for (int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();

        solve(arr, size/2);


    }


}