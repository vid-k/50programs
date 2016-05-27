package com.basic;

//3. Strings
//a. Write a program to reverse a string. Do not use StringBuffer/StringBuilder inbuilt reverse function
//Do not use StringBuffer or StringBuilder inbuilt reverse functions
public class StringReverse3a {

    public static String reverseString(String orig){
        String rev = "";
        for (int i=(orig.length()-1); i>=0; i--) {
            rev = rev + orig.charAt(i);
        }
        return rev;
    }

    public static void main(String args[]) {
        String orig = "this is for an assignment!";
        System.out.println("Original String: " + orig);
        System.out.println("Reversed String: " + reverseString(orig));
    }
}
