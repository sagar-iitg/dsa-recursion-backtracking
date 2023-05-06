package misc.recursion;


class SumofNumber{

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4};
        int sum=solve(arr,0,0);
        int sum1=solve1(arr,0);
       System.out.println(sum);
        System.out.println(sum1);

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
    public static int solve1(int arr[],int index)
    {
        if(index==arr.length)
        {
            return 0;
        }
       
       //sub problems
        return arr[index]+solve1(arr,index+1);
    }
}