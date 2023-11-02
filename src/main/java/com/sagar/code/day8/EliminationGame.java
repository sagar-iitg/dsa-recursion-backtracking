package day8;


public class EliminationGame
{


    public static void main(String[] args) 
    {

        int ans=solve(9);
        System.out.println(ans);

    }

    private static int solve(int n)
    {


        //base case
        if(n==1)
            return n;

            return 2*(1+n/2-solve(n/2));

     

    } 
    
}
