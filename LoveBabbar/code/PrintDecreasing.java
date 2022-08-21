package code;

public class PrintDecreasing {

    public static void main(String[] args) {

        Decreasing(20);

    }

    static void Decreasing(int n) {

        if (n == 0)
            return;
        System.out.print(n + " ");
        Decreasing(n - 1);
    }

}
