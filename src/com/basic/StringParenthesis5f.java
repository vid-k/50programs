package com.basic;

//3. Strings;
//f. Write a program to check if a given string of parenthesis has balanced parenthesis or not.
//For example a string as "(())" is a valid string where as strings like ")(" or "(()))" are not valid strings.

public class StringParenthesis5f {

    public static boolean parenthesisCheck(String s){
        boolean bool = true;
        int open = 0; //count number of open braces
        boolean needClose = false; //to check for more close braces before the next open brace
        for (int i=0; i<s.length();i++) {
            if (s.charAt(i) == ')' && open == 0) {
                bool = false;
                break;
            } else if (s.charAt(i) == '(' && open >= 0) {
                open++;
                needClose = true;
            } else if (s.charAt(i) == ')' && open > 1) {
                open--;
            } else if (s.charAt(i) == ')' && open == 1 && needClose == true) {
                open--;
                needClose = false;
            }
        }
        if (open != 0 || needClose == true)
            bool = false;
        return bool;
    }

    public static void main(String args[]){
        String s1 = "(100*(10/(a+5)-3)";
        System.out.println("Parenthesis Check Result for \"" + s1 + "\" : " + parenthesisCheck(s1));

        String s2 = "a)(4+3)*(6+19)";
        System.out.println("Parenthesis Check Result for \"" + s2 + "\" : " + parenthesisCheck(s2));

        String s3 = "(10+b)-((f-3)";
        System.out.println("Parenthesis Check Result for \"" + s3 + "\" : " + parenthesisCheck(s3));

        String s4 = "(10+b)-(4*(5+((f-3)+10)))";
        System.out.println("Parenthesis Check Result for \"" + s4 + "\" : " + parenthesisCheck(s4));
    }

}
