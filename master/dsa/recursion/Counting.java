package master.dsa.recursion;

import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
        sc.close();
    }
    private static void solve(int n)
    {
        // base condition
        if(n==0)
            return;
        //processing
        System.out.println(n);
        //recurrence relation
        solve(n-1);
       

    }
    
}
