package com.basic;

import static javafx.application.Platform.exit;

//print 1 to 10 numbers without using loops and you should not have more than 1 print statement
//using recursion

public class Counter8b {

    public static void printNumbers(int num, int numLimit) {
        if (num <= numLimit) {
            System.out.print(num + " ");
            num = num+1;
            printNumbers(num, numLimit);
        } else
            exit();
    }


    public static void main(String args[]) {
        printNumbers(1, 10);
    }
}
