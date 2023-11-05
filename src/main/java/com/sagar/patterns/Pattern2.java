package com.sagar.patterns;

public class Pattern2 {

    public static void main(String[] args) {
        solve(4,0);
    }

    private static void solve(int r, int c) {
        if(r==0) return;

        if(c<r) {
            solve(r,c+1);
            System.out.print("*");

        }
        else{
            solve(r-1,0);
            System.out.println();


        }
    }
}
