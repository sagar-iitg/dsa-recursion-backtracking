package day2;

public class ReverseArray {

    public static void main(String[] args) {

        int arr[] = { 10, 23, 45, -2 };
        reverse(arr, arr.length - 1);

    }

    private static void reverse(int arr[], int index) {

        // base
        if (index == -1) {
            return;
        }
        // processing
        System.out.print(arr[index] + " ");
        // recursive relation
        reverse(arr, index - 1);
    }

}
