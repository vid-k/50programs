package com.basic;

//Arrays.
//f. Write a program to locate and swap only 2 elements which are not sorted in a given sorted array. 
//For example given an array {1,2,5,6,4} locate 5 and 4 and then swap them as they are not as per sorted order.

//Example in the question is incorrect.. it should be {1, 2, 6, 5, 4} for the swap to work!

public class ArraySingleSwap2f {
	
	public static void swap(int arr[]) {
		int i, j, temp = 0;
		for (i=arr.length-1; i>0; i--)
			if (arr[i] < arr[i-1]) 
				for (j=i-1; j>=0; j--)
					if (arr[j] < arr[i]) {
						temp = arr[j+1];
						arr[j+1] = arr[i];
						arr[i] = temp;
						break;
					}
	}
	
	public static void printarr(int arr[]) {
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+ " ");
	}
	
	public static void main(String args[]) {
		int arr[] = {1, 2, 6, 5, 4};
		System.out.print("Original array: ");
		printarr(arr);
		
		swap(arr);
		System.out.print("\nSorted array after single swap: ");
		printarr(arr);
		
		

		
	}

}
