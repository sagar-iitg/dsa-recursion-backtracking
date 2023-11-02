package day6;

public class ArrayPrinting {


    public static void main(String[] args) {
        int[] arr={1,0,2,3,4,5,100,-2,1};
        solve(arr,arr.length);
        System.out.println("------------");
        solve1(arr,0,arr.length-1);
    }


    static void solve1(int[] arr,int s,int e)
    {

        if(s>=e)
        {
            System.out.println(arr[s]);
            return;
        }
        for(int i=s;i<=e;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int mid=s+(e-s)/2;
        solve1(arr, s, mid);
    }
    //tail recursion
    static void solve(int[] arr,int length){

        if(length<=1)
        {
            System.out.println(arr[0]);
            return;
        }
          
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
           // System.out.println();

        }
        System.out.println();
        solve(arr,(length+1)/2);

    }
    
}
