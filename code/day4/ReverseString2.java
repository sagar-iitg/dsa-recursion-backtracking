package day4;



public class ReverseString2 {


    /**
     *
     */
    static char[] s={'s','a','g','a','r'};

    public static void main(String[] args) {
        
        System.out.println(s);
        solve(s,0,s.length-1);
        System.out.println(s);

    }
    
    private static void solve(char[] s,int i,int j){
        if(i>=j)
            return;


        //swapping
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;

        //recursive relation
        solve(s, i+1, j-1);






    }
    
}
