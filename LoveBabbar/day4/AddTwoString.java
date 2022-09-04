package day4;

public class AddTwoString {


    public static void main(String[] args) {


        String a="743";
        String b="343";

        String ans=solve(a,b);
        System.out.println(ans);

    }
    static String solve(String a,String b)
    {
        int i=Integer.parseInt(a);  
        int j=Integer.parseInt(b);
        int res=i+j;
        return   res+"";


    }
    
}
