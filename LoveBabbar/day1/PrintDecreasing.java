package day1;

public class PrintDecreasing {

    public static void main(String[] args) {

        Decreasing(20);

    }

    static void Decreasing(int n) {

        // base
        if (n == 0)
            return;

        // one case solved
        System.out.print(n + " ");

        // recursive relation
        Decreasing(n - 1);
    }

}
