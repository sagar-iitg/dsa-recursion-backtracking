package com.sagar.dp.coinchange;



//Return the fewest number of coins that you need to make up that amount.
// If that amount of money cannot be made up by any combination of the coins, return -1.
// You may assume that you have an infinite number of each kind of coin.
public class CoinChange1 {
    public static void main(String[] args) {

        int[] arr={1,2,5};
        int amount=11;
        int res=coinChange(arr,amount);
        System.out.println(res);

    }
    public static int coinChange(int[] coins, int amount) {

        int ans=solveUsingRecursion(coins,amount);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;

    }

    private static int solveUsingRecursion(int[] coins, int amount) {

        //base condition
        if(amount==0) return 0;

        //invalid answer
        // can not make target
        if(amount<0) {
           return Integer.MAX_VALUE;
        }

        int mini=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int ans=solveUsingRecursion(coins,amount-coins[i]);
            if(ans!=Integer.MAX_VALUE){
                mini=Math.min(1+ans,mini);
            }
        }
        return  mini;

    }
}
