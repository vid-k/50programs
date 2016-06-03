package com.basic;

//Arrays
//b. Write a program to find the missing number in a series of sorted numbers stored in an array.
//Assuming array has unique numbers 0-n with one missing number in between

public class ArrayMissingNumber2b {

    public static int missingNumber(int arr[]) {
    	int i;
        for (i=0; i<arr.length; i++) {
        	if (arr[i] != i)
        		break;
        }
		return i;
    }

    public static void main(String args[]) {
        //following is sorted array. to sort an array - refer 2e
        int arr[] = {0, 1, 2, 3, 4, 5, 7, 8, 9};
        System.out.println("Missing number in the array is: " + missingNumber(arr));
    }
}
