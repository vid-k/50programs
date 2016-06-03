package com.basic;

//Arrays
//d. Write a program to perform a linear search on any given array.
//Linear search is the basic search where you look for the element to be searched in a sequential way.

public class ArraySearch2d {

	public static boolean linearSearch(int arr[], int n) {
		boolean bool = false;
		for (int i=0; i<arr.length; i++)
			if (arr[i] == n) {
				bool = true; 
				break;
			}
		return bool;
	}
	
	public static void main(String[] args) {
		int arr[] = {23, 54, 67, 32, 93, 789, 2, 64, 6750};
		int n = 67;
		if (linearSearch(arr, n) == true)
			System.out.println("Element " + n + " matched!!!");
	}

}
