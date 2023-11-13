package com.sagar.strings;

public class RemoveWordFromString {

    public static void main(String[] args) {

        String str="amanapplehxyzapplesagar";

        //method1
        System.out.println(skipWord(str,"apple"));
        //method2
        skipWord1("",str,"apple");
        //method3
        System.out.println( skipWord2("",str,"apple"));
    }

    private static String skipWord(String up,String word){

        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith(word))
        {
            return  skipWord(up.substring(word.length()),word);
        }
        else {
            return up.charAt(0)+skipWord(up.substring(1),word);

        }
    }
    private static void skipWord1(String p,String up,String word){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        if(up.startsWith(word))
        {
            skipWord1(p,up.substring(word.length()),word);
        }
        else {
            skipWord1(p+up.charAt(0),up.substring(1),word);

        }
    }
    private static String skipWord2(String p,String up,String word){

        if(up.isEmpty()){
           // System.out.println(p);
            return p;
        }

        if(up.startsWith(word))
        {
            return skipWord2(p,up.substring(word.length()),word);
        }
        else {
            return skipWord2(p+up.charAt(0),up.substring(1),word);

        }
    }
}
