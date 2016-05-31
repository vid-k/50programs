package com.basic;

//3. Strings:
//e. Write a program to check for a palindrome string.
public class StringPalindrome3e {

    public static boolean isPalindrome(String s) {
        int j = s.length();
        for (int i=0; i<s.length(); i++) {
            j--;
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }

    public static void main (String args[]) {
        String s = "Malayalam";
        if (isPalindrome(s.toLowerCase()))
            System.out.println(s + " is a palindrome string.") ;
        else
            System.out.println(s + " is not a palindrome string.") ;

    }
}


