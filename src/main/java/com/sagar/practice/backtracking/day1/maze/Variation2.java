package com.sagar.practice.backtracking.day1.maze;

import java.util.ArrayList;
import java.util.List;

public class Variation2 {


    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 1, 1}  // Destination is reachable
        };

        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        List<String> paths = new ArrayList<>();

        // If destination itself is blocked, no paths exist
        if (maze[n - 1][n - 1] == 1) {
            solve(maze, 0, 0, n - 1, n - 1, visited, "", paths);
        }

        System.out.println("All Paths: " + paths);
    }

    private static  void solve(int[][] maze,int src_x,int src_y,int des_x,int des_y,boolean[][] visited,String path,List<String> paths){

        if((src_x==des_x) && (src_y==des_y)){
            paths.add(path);
            return;
        }
        visited[src_x][src_y] = true;
        //down
        if(isSafe(maze,src_x+1,src_y,visited)){
            solve(maze,src_x+1,src_y,des_x,des_y,visited,path+"D",paths);
        }
        //up
        if(isSafe(maze,src_x-1,src_y,visited)){
            solve(maze,src_x-1,src_y,des_x,des_y,visited,path+"U",paths);
        }
        //left
        if(isSafe(maze,src_x,src_y-1,visited)){
            solve(maze,src_x,src_y-1,des_x,des_y,visited,path+"L",paths);
        }
        //right
        if(isSafe(maze,src_x,src_y+1,visited)){
            solve(maze,src_x,src_y+1,des_x,des_y,visited,path+"R",paths);
        }
        visited[src_x][src_y] = false;
    }

        private static boolean isSafe(int[][] maze, int x, int y, boolean[][] visited) {
            return (x >= 0 && x < maze.length) && (y >= 0 && y < maze[0].length) && maze[x][y] == 1 && !visited[x][y];
        }
}
