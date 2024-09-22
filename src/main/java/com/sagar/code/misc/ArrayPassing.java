package misc;

import java.util.Arrays;

public class ArrayPassing {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        for (int i : arr) {

            System.out.println(i);
        }
        System.out.println("---");

        int[] ints = Arrays.copyOfRange(arr, 1, arr.length);

        for (int i : ints) {

            System.out.println(i);
        }

    }

}
