package com.basic;

import java.util.Scanner;

public class PrimeNumber1e {

    public static boolean isPrime(int number) {
        if (number==2){
            System.out.println(number + " is Prime!");
            return false;
        }
        if (number==1 || number==0){
            System.out.println(number + " is neither Prime nor Composite!");
            return false;
        }
       for (int i=2;i<=(number/2);i++)
           if ((number % i) == 0){
               System.out.println(number + " is not Prime!");
               return false;
           }
        System.out.println(number + " is Prime!");
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value to check for prime: ");
        isPrime(sc.nextInt());
    }
}
