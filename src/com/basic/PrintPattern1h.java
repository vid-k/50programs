package com.basic;


import java.util.Scanner;

public class PrintPattern1h {

    public static void printAsterisks(int number) {
        for (int i=1; i<=number; i++) {
            for (int j=1; j<=i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows for Asterisks printing: ");
        printAsterisks(sc.nextInt());
    }
}
