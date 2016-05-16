package com.basic;


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
