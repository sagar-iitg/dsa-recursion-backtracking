package day1;

public class Factorial {


    public static void main(String[] args) {
        
        int input=10;
        int res=fibo(input);
        System.out.println(res);

    }
    static int fibo(int n)
    {
        //handling invalid input
        if(n<0)
            return -1;
        if( n>=0 && n<=1)
            return 1;

        return n*fibo(n-1);

    }
}
