package day2;

import java.util.Arrays;

//third method not possible in java
public class ReverseArray2 {

    public static void main(String[] args) {

        int arr[] = { 10, 23, 45, -2 };
        reverse(arr, arr.length - 1, 0);

    }

    static void reverse(int arr[], int size, int index) {

        // base
        if (size == 0) {
            return;
        }
        System.out.print(arr[0] + " ");
        reverse(Arrays.copyOfRange(arr, index + 1, arr.length + 1), size, index + 1);
    }

}
