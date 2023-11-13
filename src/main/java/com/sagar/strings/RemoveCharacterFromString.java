package com.sagar.strings;

public class RemoveCharacterFromString {

    public static void main(String[] args) {

        String str="zabaccadfghya";


        //method 1
        StringBuilder ans=new StringBuilder();
        skipCharacter(str,0,ans,'a');
        System.out.println(ans);
        //method 2
        System.out.println( skipCharacter1("",str));
        //method 3
        skipCharacter2("",str);
        //method 4
        System.out.println(skipCharacter3(str));

    }

    private static void skipCharacter(String up, int index, StringBuilder p, char ch) {
        if(index==up.length()) return;

        if(up.charAt(index)!=ch)
        {
            p.append(up.charAt(index));
            skipCharacter(up,index+1,p,ch);
        }
        else{
            skipCharacter(up,index+1,p,ch);

        }


    }
    private static String skipCharacter1(String p,String up){

        if(up.isEmpty()){
            //System.out.println(p);
            return p;
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            return skipCharacter1(p,up.substring(1));
        }
        else {
            return skipCharacter1(p+ch,up.substring(1));

        }
    }

    private static void skipCharacter2(String p,String up){

        if(up.isEmpty()){
            System.out.println(p);
           return;
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
             skipCharacter2(p,up.substring(1));
        }
        else {
             skipCharacter2(p+ch,up.substring(1));

        }
    }

    private static String skipCharacter3(String up){

        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            return  skipCharacter3(up.substring(1));
        }
        else {
            return ch+skipCharacter3(up.substring(1));

        }
    }


}
