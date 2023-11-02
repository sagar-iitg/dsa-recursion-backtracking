package com.sagar.master;
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println("-----");
        solve(n);
        sc.close();
    }
    private static void solve(int n)
    {
        // base condition
        if(n==0)
            return;
        //processing
        System.out.println(n);
        //recurrence relation
        solve(n-1);
       

    }
    
}
