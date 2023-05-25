package day7.subsequence;

public class LongestIncreasingSubsequence {


    public static void main(String[] args) {
        
        int arr[]={0,1,0,3,2,3};
        int prev=-1;
        int curr=0;
        int ans=solve(arr,arr.length,curr,prev);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int n, int curr, int prev) {
        if(curr==n)
            return 0;

        int pick=0;

        //include
        if(prev==-1 || arr[curr]>arr[prev])
        {
            pick=1+solve(arr, n, curr+1, curr);
        }

        //exclude
            int notpick=0+solve(arr, n, curr+1, prev);
        
            return Math.max(pick, notpick);

        

       
    }
    
}
