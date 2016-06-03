package com.basic;

//Arrays.
//c. Write a program to find the common number in any given two arrays.


public class ArrayCommonNumber2c {
	
	public static int commonNum(int arr1[], int arr2[]) {
		int i, j, cnum = 0;
		for (i=0; i<arr1.length; i++) {
			for (j=0; j<arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					cnum = arr1[i];
					break;
				}
			}
		}
		return cnum;
	}
	
	public static void main(String args[]) {
		int arr1[] = {23, 53, 64, 87, 910};
		int arr2[] = {34, 43, 89, 9, 2, 910, 320};
		System.out.println("Common number between the 2 arrays is: " + commonNum(arr1, arr2));
	}
}
