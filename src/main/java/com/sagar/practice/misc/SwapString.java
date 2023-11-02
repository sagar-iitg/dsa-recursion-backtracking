package misc;

public class SwapString {

    public static void main(String[] args) {
        String str="hello";
        str=swap(str,0,4);

        System.out.println(str);


        
    }
    public static String swap(String str, int i,int j){
        StringBuilder sb=new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();




    }
    
}
