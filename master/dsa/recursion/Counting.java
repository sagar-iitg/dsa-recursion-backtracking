package master.dsa.recursion;

public class Counting {

    public static void main(String[] args) {
        
        solve(5);
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
