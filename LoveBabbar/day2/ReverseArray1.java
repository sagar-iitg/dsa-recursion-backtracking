package day2;

public class ReverseArray1 {

    public static void main(String[] args) {

        int arr[] = { 10, 23, 45, -2 };
        reverse(arr, arr.length, 0);

    }

    static void reverse(int arr[], int size, int index) {

        // base
        if (index ==size) {
            return;
        }
       
        reverse(arr, size, index+1);
        System.out.print(arr[index] + " ");
    }

}
