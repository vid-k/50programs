package com.basic;

import java.util.Scanner;

public class Factorial1d {

    public static int factRecursive(int number) {
        if (number <= 1)
            return number;
        else {
            return number * factRecursive(number - 1);
        }
    }

    public static int factNotRecursive(int number) {
        int tempFact = 1;
        if (number <= 1)
            return 0;
        else
            while (number != 1){
                tempFact = tempFact*number;
                number--;
            }
        return tempFact;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the Factorial: ");
        int num = sc.nextInt();

        int f = factRecursive(num);
        System.out.println("Factorial after recursion: " + f);
        f = factNotRecursive(num);
        System.out.println("Factorial without recursion: " + f);
    }

}
