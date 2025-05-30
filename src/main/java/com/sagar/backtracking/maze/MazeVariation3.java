package com.sagar.backtracking.maze;

public class MazeVariation3 {


    public static void main(String[] args) {
           solve("",3,3);
    }

      private static void solve(String result, int row, int col) {

        if(row==1 && col==1)
        {
            System.out.println(result);
            return;

        }
        
        if(row>1)
        {
            solve(result+'V', row-1, col);
        }

        if(col>1)
        {
            solve(result+'H', row, col-1);
        }

        if(row>1 && col>1)
        {
            solve(result+'D', row-1, col-1);
        }


    }
    
}
