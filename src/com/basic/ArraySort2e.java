package com.basic;

//Arrays.
//e. Write a program to sort an array.


public class ArraySort2e {

	public static int[] sort(int arr[]) {
		int temp;
		for (int i=0; i<arr.length ; i++) {
			for (int j=i+1; j<arr.length; j++){
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {353, 53, 243, 65, 7, 5460};
		int sortedarr[] = sort(arr);
		System.out.println("Sorted array:");
		for (int i=0 ; i<arr.length; i++) {
			System.out.print(sortedarr[i] + " ");
		}
	}

}
