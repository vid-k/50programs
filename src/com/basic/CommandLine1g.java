package com.basic;

import java.util.Scanner;

//1. Loops.
//g. Write a program that accepts input from the command line and then prints them.

public class CommandLine1g {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anything you want me to print back for you: ");
        String s = sc.nextLine(); //prints back one line
        System.out.println("Printing it back for you: " + s);
    }
}
