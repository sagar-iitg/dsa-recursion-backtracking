package com.sagar.patterns;

import java.util.HashMap;

public class Pattern1 {

    public static void main(String[] args) {
        solve(10,0);
    }

    private static void solve(int r, int c) {
        if(r==0 && c==0) return;
        if(c<r) {
            System.out.print("*");
            solve(r,c+1);
        }
        else{
            System.out.println();
            solve(r-1,0);

        }
    }

}
