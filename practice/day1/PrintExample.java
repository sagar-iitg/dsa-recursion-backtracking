package day1;

public class PrintExample{


    public static void main(String[] args) {
        printIncreasingOrder(7);
        System.out.println();
        printDecreasingOrder(4);
        System.out.println();
        bothSidePrint(6);

    }
    static void bothSidePrint(int n)
    {

        if(n==0)
            return;
        
        System.out.print(n+" ");
        bothSidePrint(n-1);
        System.out.print(n+" ");
      
    }
    static void printIncreasingOrder(int n)
    {

        if(n==0)
            return;
        printIncreasingOrder(n-1);
        System.out.print(n+" ");
    }
    //tail recursion
    static void printDecreasingOrder(int n)
    {
        if(n==0)
            return;
            //ek case hum solve kar dega
        System.out.print(n+" ");
        //rest recursion will take care of it
        printDecreasingOrder(n-1);
    }
    
}
