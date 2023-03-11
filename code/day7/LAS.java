package day7;



public class LAS {
    

    public static void main(String[] args)
    {

        int[] arr={9,4,7,2,0};
        int n=arr.length;


        int ans=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int diff=arr[j]-arr[i];

                //catch here: add 2
                ans=Math.max(ans,2+solve(arr,i,diff));

            }
        }

        System.out.println(ans);


     }

     static int solve(int[] arr,int i,int diff)
     {

        if(i<0)
        {

            return 0;
        }



        int ans=0;
        //backward
        for(int k=i-1;k>=0;k--)
        {

            if(arr[i]-arr[k]==diff)
            {   
                //number AP found

                ans=Math.max(ans, 1+solve(arr, k, diff));

            }
        }
        return ans;



     }
}
