package com.basic;

import java.util.Scanner;

//1. Loops:
//a. Write a program that prints a fibonaci series that is a sequence of numbers like 0 1 1 2 3 5 8.
// You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 or any desired number.

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
			System.out.print("Fibonacci Series is: "+a+" "+b);
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

		System.out.println("\n");
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

