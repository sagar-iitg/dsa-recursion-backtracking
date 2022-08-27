package day2;

public class FirstIndexofTarget1 {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 0, 3, 7, 4, 0, 0, 0 };
        int target = 7;
        int ans = solve(arr, target, 0, arr.length);
        System.out.println(ans);
    }

    static public int solve(int[] arr, int target, int index, int size) {

        if (index == size) {
            // System.out.println("Not found");
            return -1;
        }
        if (arr[index] == target) {
            // System.out.println(index);
            return index;
        }

        return solve(arr, target, index + 1, size);
        // return -1;

    }

}
