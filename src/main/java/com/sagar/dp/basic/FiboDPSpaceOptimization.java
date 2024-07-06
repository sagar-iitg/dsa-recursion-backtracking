package com.sagar.dp.basic;

public class FiboDPSpaceOptimization {

    public static void main(String[] args) {
        int n=6;
        int ans=fibo(n);
        System.out.println(ans);

    }

    static int fibo(int n){

        //base case
        int prev2=0;
        int prev1=1;

        for(int i=2;i<=n;i++){
            //dp[i]=dp[i-1]+dp[i-2];
            int curr=prev2+prev1;
            prev2=prev1;
            prev1=curr;
        }

        return  prev1;
    }
}
