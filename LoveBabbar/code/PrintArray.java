package code;

public class PrintArray {

    public static void main(String[] args) {

        int[] arr = { 10, 25, 4, 5 };

        print(arr, arr.length, 0);

    }

    static void print(int[] arr, int size, int index) {

        if (index == size) {
            return;

        }
        System.out.println(arr[index]);
        print(arr, size, index + 1);

    }

}
