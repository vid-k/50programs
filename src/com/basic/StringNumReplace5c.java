package com.basic;

//3. Strings:
//c. Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".
public class StringNumReplace5c {

    public static String retNumString(String orig){
        String numString = "";
        String word[] = orig.split(" ");
        for (int i=0; i<word.length; i++) {
            numString = numString + " " + word[i] + Integer.toString(i+1);
        }
        return numString;
    }

    public static void main(String args[]){
        String orig = "This is fun";
        System.out.println("Original String:" + orig);
        System.out.println("Numbered String:" + retNumString(orig));
    }
}
