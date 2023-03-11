package day1;

public class PrintIncreasing {

    public static void main(String[] args) {

        Increasing(20);

    }

    /**
     * @param n
     */
    static void Increasing(int n) {

        if (n == 0)
            return;
        Increasing(n - 1);
        System.out.print(n + " ");

    }
}
