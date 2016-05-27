package com.basic;

//1. Loops:
//b. Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5,
// and "ping pong" if number is divisible by both, else print the number.

public class DivisibleBy1b {

	public static String findDivisible(int number)
	{
		String s = null;
		if (number!=0) {
			if ((number % 3 == 0) && (number % 5 == 0))
				s = "ping pong";
			else if (number % 3 == 0)
				s = "ping";
			else if (number % 5 == 0)
				s = "pong";
		}
		return s;
	}
	
	
	public static void main(String[] args) {

		int num = 15;
		String s = findDivisible(num);
		if (s!=null)
		{
			System.out.println(s);
		}
		else 
			System.out.println(num);
	}

}
