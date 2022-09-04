package day6;


public class Q3{

    public static void main(String[] args) {
        int arr[]={1,9,7,100,64,33};

        solve(arr,0,arr.length-1);
    }
    static int mid=0;
    private static void solve(int[] arr,int s,int e){
     
        //Base Case
        if(s>=e){
            System.out.println(arr[mid-1]);
            return;
        }
        for (int i=s;i<=e;i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();

        mid=s+(e-s)/2;
        solve(arr, mid+1,e);


    }


}

