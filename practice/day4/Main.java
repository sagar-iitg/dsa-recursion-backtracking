package day4;


public class Main {
   
    public static void main(String[] args) {
        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str
            = new StringBuilder("WelcomeGeeks");
 
           
        // print string
        System.out.println("String = "
                           + str.toString());
 
        // reverse the string
        StringBuilder reverseStr = str.reverse();
 
        // print string
        System.out.println("Reverse String = "
                           + reverseStr.toString());
    }
    
}
