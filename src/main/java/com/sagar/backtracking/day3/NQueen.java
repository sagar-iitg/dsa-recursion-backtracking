package com.sagar.backtracking.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NQueen {

    public static void main(String[] args) {
        int n=4;

        List<List<String>> board = IntStream.range(0, n)
                .mapToObj(i -> new ArrayList<>(Collections.nCopies(n, ".")))
                .collect(Collectors.toList());
        System.out.println(board);

        List<List<String>> ans = new ArrayList<>();
        solve(ans, board, n, 0);
        System.out.println(ans);
    }
   static void solve(List<List<String>> ans, List<List<String>> board, int n, int col) {
        if (col == n) {
            // Store a deep copy of the board in ans
            ans.add(board.stream().map(row -> String.join("", row)).collect(Collectors.toList()));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, col, n)) {
                // Place the queen
                board.get(row).set(col, "Q");

                // Recur for next column
                solve(ans, board, n, col + 1);

                // Backtrack
                board.get(row).set(col, ".");
            }
        }
    }

   static boolean isSafe(List<List<String>> board, int row, int col, int n) {
        int x = row, y = col;

        // Check left row
        while (y >= 0) {
            if (board.get(x).get(y).equals("Q")) return false;
            y--;
        }

        // Check upper diagonal
        x = row; y = col;
        while (y >= 0 && x >= 0) {
            if (board.get(x).get(y).equals("Q")) return false;
            y--; x--;
        }

        // Check lower diagonal
        x = row; y = col;
        while (y >= 0 && x < n) {
            if (board.get(x).get(y).equals("Q")) return false;
            y--; x++;
        }

        return true;
    }
}
