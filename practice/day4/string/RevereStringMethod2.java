package day4.string;


public class RevereStringMethod2 {


 
 
    public static void main(String[] args)
    {
        String str = "Kumar sagar";
 
        char[] c = str.toCharArray();
        reverse(c, 0, c.length - 1);
        str = new String(c);
 
        System.out.print(str);
    }


    
    // Recursive function to reverse a given string
    public static void reverse(char[] c, int l, int h)
    {
        if (l < h)
        {
            swap(c, l, h);
            reverse(c, l + 1, h - 1);
        }
    }
    
    private static void swap(char[] c, int i, int j)
    {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
    
}
