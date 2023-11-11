package com.sagar.strings;

public class RemoveWordFromString {

    public static void main(String[] args) {

        String str="amanappleh";
        System.out.println(skipWord(str,"apple"));

        skipWord1("",str,"apple");
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
}
