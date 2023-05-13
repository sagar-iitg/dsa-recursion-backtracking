package day1;

public class PrintDecreasing {


    public static void main(String[] args) {
        
        int n=6;
        solve(n);

    }
    static void solve(int n)
    {
        if(n==0)
            return;
            //ek case hum solve kar dega
        System.out.print(n+" ");
        //rest recursion will take care of it
        solve(n-1);
    }
    
}
