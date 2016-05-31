package com.basic;

//3. Strings:
//b. Write a program to find a substring in a given string and then replace it with another string.

public class StringSub3b {

    public static String subString(String orig, String suborig, String subreplace) {
        return orig.replaceAll("(?i)"+suborig, subreplace);
    }

    public static void main(String args[]){
        String orig = "This is a java program. This is for an assignthismment, this is fun!";
        String suborig = "this";
        String subreplace = "THAT";
        System.out.println("Original String:" + orig);
        System.out.println("String after replacing word:" + subString(orig, suborig, subreplace));
    }

}
