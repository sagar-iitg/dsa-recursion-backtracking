package misc.recursion;


class SumofNumber{

    public static void main(String[] args) {
        
        int arr[]={-1,2,5,4};
        int sum=solve(arr,0,0);
        System.out.println(sum);

    }
    public static int solve(int arr[],int i,int ans)
    {
        if(i==arr.length)
        {
            return ans;
        }
        ans=ans+arr[i];
       
        return solve(arr,i+1,ans);
    }
}