package com.sagar.code.day1;

public class BothIncresingandDecresing {

    public static void main(String[] args) {

        IncreasingandDecreasing(20);

    }

    static void IncreasingandDecreasing(int n) {

        // Base Case
        if (n == 0)
            return;
        // Processing
        // first case
        System.out.print(n + " ");
        // Recursive Relation
        IncreasingandDecreasing(n - 1);
        // first case---- processing
        System.out.print(n + " ");
    }

}
