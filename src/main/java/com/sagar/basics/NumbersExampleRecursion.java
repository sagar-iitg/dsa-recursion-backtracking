package com.sagar.basics;

public class NumbersExampleRecursion {

    public static void main(String[] args) {
        //print first five number
        int n=5;
        print(n);
    }

    private static void print(int n) {
        if(n==0) return;
        print(n-1);
        System.out.println(n);

    }


    public static class Power {


        public static void main(String[] args) {



            int res=pow(5,3);
            System.out.println(res);


        }

        private static int pow(int a,int b){


                if(b==0)
                    return 1;

             return a*pow(a,b-1);



        }
    }
}
