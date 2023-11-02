package day7;



public class LCS {


    //static ArrayList<Character> c=new ArrayList<>();

    public static void main(String[] args) 
    {
        String str1="abcde";
        String str2="acexyz";
        int res=solve(str1,0,str2,0);
        System.out.println(res);
        //System.out.println(c);


    }

    private static int solve(String s1,int index1,String s2,int index2)
    {


        //base case;
        
        if(index1==s1.length())
        {
            return 0;
        }

        if(index2==s2.length())
        {
            return 0;
        }

        int ans=0;
        if(s1.charAt(index1)==s2.charAt(index2))
        {
          //  c.add(s1.charAt(index1));
            ans=1+solve(s1, index1+1, s2, index2+1);
        }

        else{
            ans=Math.max(solve(s1, index1+1, s2, index2),solve(s1, index1, s2, index2+1));
        }
        return ans;
      

    } 


    
}
