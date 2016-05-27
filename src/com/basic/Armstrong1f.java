package com.basic;

import java.util.Scanner;

//1. Loops:
//f. Write a program  to check an armstrong number i.e. whether the if we power up the each individual number to the total number of digits in the number and add them it should be equal to the number itself. For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.
//FYI: ^ means is to the power.

public class Armstrong1f {

    public static boolean isArmstrong(int number){
        String s = Integer.toString(number);
        int digits = s.length();
        double psum = 0;
        int tempNum = number;
        for (int i=1;i<=digits;i++){
            psum = psum + (Math.pow((tempNum%10),digits));
            tempNum = tempNum/10;
            //System.out.println(tempNum + " " + psum + " "+ i);
        }
        if (psum == Integer.parseInt(s)) {
            System.out.println(number + " is an Armstrong number");
            return true;
        }
        else {
            System.out.println(number + " is not an Armstrong number");
            return false;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value to check if it is Armstrong number: ");
        isArmstrong(sc.nextInt());
    }
}
