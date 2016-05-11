package com.basic;

import java.util.Scanner;

public class Fibonacci1a {

	public static int findLastFibonacci (int num) 
	{
		int a=0;
		int b=1;
		int fib=0;
		if (num < 2)
		{
			System.out.println("The number of iterations should be 2 or more!");
		}
		else
		{		
			//if only 2 iterations, then no need to loop
			System.out.println("Fibonacci Series is: "+a+" "+b);
			fib=a+b;
			
			//Already printed 0, 1. So num-2 is the remaining number of iterations
			for (int i=0;i<num-2;i++)
			{
				fib=a+b;
				a=b;
				b=fib;
			System.out.print(" "+fib);
			}
		}
		return fib;
	} //end class
	
	
	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
		System.out.print("Please enter number of iterations you want to write the Fibonacci Series:");
		int num = sc.nextInt();
	
		int fib = findLastFibonacci(num);
		if (fib>0)
		{
			System.out.println("\nLast number in the series: " +fib);
		}
		
	} // end main

} //end class

