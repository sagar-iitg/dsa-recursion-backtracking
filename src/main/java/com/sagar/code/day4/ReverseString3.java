package day4;

public class ReverseString3 {


    public static void main(String[] args) 
    {
        
        String str="sagar kumar";
        solve(str,0,str.length());
       

    }

    //head recursion
    static void solve(String str,int index,int size)
    {
        if(index==size)
        {
            return;
        }

        solve(str, index+1, size);
        char temp=str.charAt(index);
        StringBuilder ans=new StringBuilder();
        ans.append(temp); 
        
        
        System.out.print(ans);
    



    }
    
}
