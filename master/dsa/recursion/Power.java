package master.dsa.recursion;

public class Power {
    

    public static void main(String[] args) {
        


        int res=pow(2,11);
        System.out.println(res);


    }

    private static int pow(int a,int b){


            if(b==0)
                return 1;
                
         return a*pow(a,b-1);

         

    }
}