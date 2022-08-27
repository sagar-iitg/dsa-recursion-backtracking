package day1;

public class BothIncresingandDecresing {

    public static void main(String[] args) {

        IncreasingandDecreasing(20);

    }

    static void IncreasingandDecreasing(int n) {

        if (n == 0)
            return;
        System.out.print(n + " ");
        IncreasingandDecreasing(n - 1);
        System.out.print(n + " ");
    }

}
