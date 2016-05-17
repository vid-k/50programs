package com.basic;

import static java.lang.Integer.*;

public class NullPointerException7a {

    public static void isException() {
        String s = null;
        try {
            System.out.println(">>Inside try");
            System.out.print(s.length());
        }
        catch (NullPointerException e)
        {
            System.out.println(">>Inside catch");
            System.out.println("String s is null, so we get " + e);
        }
        finally {
            System.out.println(">>Inside finally");
            System.out.println("This is the block which is always executed!");
        }
    }

    public static void main(String args[]) {
        isException();
    }
}
