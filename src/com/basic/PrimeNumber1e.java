package com.basic;

import java.util.Scanner;

//1. Loops:
//e. Write a program to check if a given number is prime or not.

public class PrimeNumber1e {

    public static char isPrime(int number) {
        char primeOrNot = 't';
        if (number==2)
            primeOrNot = 'n';
        if (number==1 || number==0)
            primeOrNot = 'n';
       for (int i=2;i<=(number/2);i++)
           if ((number % i) == 0)
               primeOrNot = 'f';

        return primeOrNot;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value to check for prime: ");
        int n = sc.nextInt();
        char primeOrNot = isPrime(n);
        if (primeOrNot == 't')
            System.out.println(n + " is Prime");
        else if (primeOrNot == 'f')
            System.out.println(n + " is not Prime");
        else if (primeOrNot == 'n')
            System.out.println(n + " is neither Prime nor Composite");
    }
}
