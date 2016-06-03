package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Arrays.
//g. Write a program to merge 2 arrays.


public class ArrayMerge2g {
	
	public static int[] mergearr(int arr1[], int arr2[]) {
		int merge[] = new int[arr1.length+arr2.length];
		for (int i=0; i<arr1.length; i++) 
			merge[i] = arr1[i];
		for (int k=0,j=arr1.length; k<arr2.length; k++,j++)
			merge[j] = arr2[k];
		return merge;	
	}
	
	public static void main(String args[]) {
		int arr1[] = {1, 34};
		int arr2[] = {230, 8, 91};
		int merged1[] = mergearr(arr1, arr2);
				
		System.out.print("Merged array using loops: ");
		for (int i=0; i<merged1.length; i++) 
			System.out.print(merged1[i] + " ");
		
	}

}
