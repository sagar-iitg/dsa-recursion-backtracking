package com.sagar.backtracking.maze;

public class MazeWithObstacles {

    public static void main(String[] args) {
        
            boolean[][] board={{true,true,true},{true,true,true},{true,true,true}};

            solve("",board,0,0);

    }

    private static void solve(String result,  boolean[][] board, int row, int col) {

        if(row==board.length-1 && col==board[0].length-1)
        {
            System.out.println(result);
            return;
        }

        if(!board[row][col])
        {
            return;
        }

        board[row][col]=false;


        if(row<board.length-1)
        {
            solve(result+"D", board, row+1, col);
        }
        if(col<board[0].length-1)
        {
            solve(result+"R", board, row, col+1);
        }

        if(row>0)
        {
            solve(result+'U', board, row-1, col);
        }
        if(col>0)
        {
            solve(result+"L", board, row, col-1);

        }
        board[row][col]=true;





    }
    
}
