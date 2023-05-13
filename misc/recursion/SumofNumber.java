package misc.recursion;


class SumofNumber{

    public static void main(String[] args) {
        
        int arr[]={1,2,4,5,6666,90,-983,4};
        int sum=solve(arr,0,0);
        int sum1=solve1(arr,0);
        int sum2=solve2(arr,0);
       System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);

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
        if(index==arr.length-1)
        {
            return arr[index];
        }
       
       //sub problems
        return arr[index]+solve1(arr,index+1);
    }
    public static int solve2(int arr[],int index)
    {
        if(index==arr.length)
        {
            return 0;
        }
       
       //sub problems
        return arr[index]+solve1(arr,index+1);
    }
}