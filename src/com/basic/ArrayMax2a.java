package com.basic;

//Arrays
//a. Write a program to find the largest number in a given array.

public class ArrayMax2a {

    public static int whatIsMaxArray(int arr[]) {
        int max = arr[0]; //assume 1st element is the largest in the array to begin with
        for (int i=1; i<arr.length; i++) {
            if (max<arr[i])
                max = arr[i];
        }
        return max;
    }

    public static void main(String args[]) {
        int arr[] = {1100, 33, 223, 87, 5, 90};
        System.out.println("Largest number in the array is: " + whatIsMaxArray(arr));
    }
}
