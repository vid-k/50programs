package com.basic;

//1. Loops
//c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
// --> One Function should swap the numbers without any third new variable.
// --> Second function should swap the numbers using a third variable.

public class SwapNumbers1c {

    int i;
    int j;

    public static void swapWithTemp(SwapNumbers1c s) {
        int temp;
        temp = s.i;
        s.i = s.j;
        s.j = temp;
    }

    public static void swapWithoutTemp(SwapNumbers1c s) {
        s.i = s.i + s.j;
        s.j = s.i - s.j;
        s.i = s.i - s.j;
    }

    public static void main(String[] args) {
        SwapNumbers1c s = new SwapNumbers1c();
        s.i = 20;
        s.j = 35;

        System.out.println("Before swap with temp variable: i=" + s.i + " j=" + s.j);
        swapWithTemp(s);
        System.out.println("After swap with temp variable: i=" + s.i + " j=" + s.j);
        System.out.println("-----------------------------------------------------");
        System.out.println("Before swap without temp variable: i=" + s.i + " j=" + s.j);
        swapWithoutTemp(s);
        System.out.println("After swap without temp variable: i=" + s.i + " j=" + s.j);
    }
}
