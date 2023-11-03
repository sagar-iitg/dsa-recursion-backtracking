package com.sagar.concept.increment.decrement.operator;

public class InfiniteRecursionConcept {
    public static void main(String[] args) {

        fun(10);
    }

    private static void fun(int n) {
        if(n==0) return;

        System.out.println(n);
        fun(n--);
    }
}
