package com.sagar.practice.backtracking.day1.maze;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 0, 1}  // Destination is now reachable
        };

        int n = maze.length;
        boolean[][] visited = new boolean[n][n];

        // Check if destination itself is blocked before calling solve()
        boolean result = (maze[n - 1][n - 1] == 1) && solve(maze, 0, 0, n - 1, n - 1, visited);

        System.out.println("Path Exists: " + result);
    }

    private static boolean solve(int[][] maze, int src_x, int src_y, int des_x, int des_y, boolean[][] visited) {
        // Base case: If we reach the destination
        if (src_x == des_x && src_y == des_y) return true;

        // Mark the current cell as visited
        visited[src_x][src_y] = true;

        // Variables to store possible move results
        boolean moveDown = false, moveRight = false, moveUp = false, moveLeft = false;

        // Move Down (x, y - 1)
        if (isSafe(maze, src_x, src_y - 1, visited)) {
            visited[src_x][src_y - 1] = true;
            moveDown = solve(maze, src_x, src_y - 1, des_x, des_y, visited);
            visited[src_x][src_y - 1] = false; // Backtrack
        }

        // Move Right (x + 1, y)
        if (!moveDown && isSafe(maze, src_x + 1, src_y, visited)) {
            visited[src_x + 1][src_y] = true;
            moveRight = solve(maze, src_x + 1, src_y, des_x, des_y, visited);
            visited[src_x + 1][src_y] = false; // Backtrack
        }

        // Move Up (x, y + 1)
        if (!moveDown && !moveRight && isSafe(maze, src_x, src_y + 1, visited)) {
            visited[src_x][src_y + 1] = true;
            moveUp = solve(maze, src_x, src_y + 1, des_x, des_y, visited);
            visited[src_x][src_y + 1] = false; // Backtrack
        }

        // Move Left (x - 1, y)
        if (!moveDown && !moveRight && !moveUp && isSafe(maze, src_x - 1, src_y, visited)) {
            visited[src_x - 1][src_y] = true;
            moveLeft = solve(maze, src_x - 1, src_y, des_x, des_y, visited);
            visited[src_x - 1][src_y] = false; // Backtrack
        }

        // Unmark the current cell before returning (backtracking)
        visited[src_x][src_y] = false;
        return moveDown || moveRight || moveUp || moveLeft;
    }

    private static boolean isSafe(int[][] maze, int x, int y, boolean[][] visited) {
        return (x >= 0 && x < maze.length) && (y >= 0 && y < maze[0].length) && maze[x][y] == 1 && !visited[x][y];
    }
}
