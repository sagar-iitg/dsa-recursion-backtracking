package day2;

public class MaximumInArray1 {

    public static void main(String[] args) {
        int arr[] = { 1, 23, 0, 9 };
        int maxi = Integer.MIN_VALUE;

        getMax(arr, arr.length, 0, maxi);

    }

    private static void getMax(int[] arr, int size, int index, int maxi) {

        if (index == size) {
            return;
        }

        getMax(arr, size, index + 1, maxi);

    }

}
