package day7.subsequence;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        

        String str1="abc";
        String str2="def";
        int index1=0;
        int index2=0;
    
        int ans=fun(str1,str2,index1,index2);
        System.out.println(ans);
    }
    
    private static int fun(String str1, String str2, int i, int j) {



        if(str1.length()==i || str2.length()==j)
            return 0;


        if(str1.charAt(i)==str2.charAt(j))
            {
                return 1+fun(str1,str2,i+1,j+1);
            }
            else{

                return Math.max(fun(str1, str2, i+1, j),fun(str1, str2, i, j+1));
            }

   

  
    }
    
}
