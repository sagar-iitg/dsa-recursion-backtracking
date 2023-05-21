package string;

public class ReverseStringMethod3 {
    

    public static void main(String[] args) {
        
        String str="sagar kumar";
        StringBuilder ans=new StringBuilder("");
        solve(str,0,ans);
        System.out.println(ans);
    }

    static void solve(String str,int index,StringBuilder ans)
    {
        if(index>=str.length())
            return;
        
        solve(str, index+1, ans);
        ans=ans.append(str.charAt(index));
    } 
   
}
