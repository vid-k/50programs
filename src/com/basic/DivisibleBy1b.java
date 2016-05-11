package com.basic;

import java.util.ArrayList;

public class DivisibleBy1b {

	public static String findDivisible(int number)
	{
		String s = null;
		
		if ((number%3 == 0) && (number%5 == 0))
		{
			s = "ping pong";
		}
		else if (number%3 == 0)
		{ 
			s = "ping";
		}
		else if (number%5 == 0)
		{
			s = "pong";
		}

		return s;
	}
	
	
	public static void main(String[] args) {
		
		int num = 25;
		String s = findDivisible(num);
		if (s!=null)
		{
			System.out.println(s);
		}
		else 
			System.out.println(num);
	}

}
