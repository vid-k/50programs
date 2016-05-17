package com.basic;

import java.util.Scanner;

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
