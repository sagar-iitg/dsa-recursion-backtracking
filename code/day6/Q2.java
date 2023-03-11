
package day6;


public class Q2{

    public static void main(String[] args) {
        int arr[]={1,9,7,100,64,33,0};

        solve(arr,0,arr.length-1);
    }

    private static void solve(int[] arr,int s,int e){
        //Base Case
        if(s>=e){
            System.out.println(arr[0]);
            return;
        }
        for (int i=s;i<=e;i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();

        int mid=s+(e-s)/2;
        solve(arr, s,mid);


    }


}
