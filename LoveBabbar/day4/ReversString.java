package day4;

public class ReversString {

    public static void main(String[] args) {

        String str = "sagar";
        int size = str.length();
        System.out.println(size);
        solve(str, size, 0);

    }

    /**
     * @param s
     * @param size
     * @param index
     */
    private static void solve(String s, int size, int index) {
        if (index== size) {
            return;
        }
        System.out.println(index);
        solve(s, size,index+1);
        
        System.out.print(s.charAt(index));

    }

}