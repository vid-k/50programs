package com.temp;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//1. Sort array of Strings based on their length in Java 
//2. Find second lengthiest string in string array
//3. Display count of duplicate characters along with character in given string.
//eg: hiiiihelllooooooo
//h-2
//i-4
//l-3
//o-7
//4. Find highest occurred character in a String

public class SortingAlgorithms {

	//1. Sort array of Strings based on their length in Java
	public static String[] sortByLength(String[] strArray) {
		String temp;
		for (int i = 0; i<strArray.length; i++) {
			for (int j = i+1; j<strArray.length; j++){
				if (strArray[i].length() > strArray[j].length()) {
					temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = temp;
				}
			}		
		}
		return strArray;
	}
	

	//2. Find second lengthiest string in string array
	public static String findLenghthiestString(String[] strArray) {
		String maxlenstr = "";
		for (int i=1; i<strArray.length; i++) {
			if (strArray[i].length() > maxlenstr.length())
				maxlenstr = strArray[i];
		}
		return maxlenstr;
	}
	
	
	//3. Display count of duplicate characters along with character in given string.
	public static Map<Character, Integer> duplicateChars(String str) {
		Map<Character, Integer> countMap = new TreeMap<Character, Integer>();
		int counter = 1;
		for (int i=0; i<str.length(); i++) {
			if (countMap.get(str.charAt(i)) != null)
				counter = countMap.get(str.charAt(i))+1;
			else 
				counter = 1;
			countMap.put(str.charAt(i), counter);
		}
		return countMap;
	}
	
	
	public static void main(String args[]) {
		String[] str = {"abc", "defg","hijklmn", "z", "xy"};
		System.out.println("Original String Array:");
		for (String s: str)
			System.out.println(s);
		
		//1. Sort array of Strings based on their length in Java
		String[] sorted_strArray = sortByLength(str);
		System.out.println("\n1. Sorted array of Strings based on their length in Java:");
		for (String s: sorted_strArray)
			System.out.println(s);
		
		//2. Find second lengthiest string in string array
		System.out.println("\n2. Find second lengthiest string in string array: " + findLenghthiestString(str));
	
		//3. Display count of duplicate characters along with character in given string.
		String strg = "hiiiihelllooooooo";
		Map<Character, Integer> dupChars = duplicateChars(strg);
		System.out.println("\n3. Count of duplicate characters along with character in given string:");
		for (Entry<Character, Integer> n : dupChars.entrySet())
			if (n.getValue() > 1)
				System.out.println(n);
		
		
		//4. Find highest occurred character in a String
		//contd. from code for Question 3.
		int maxValue = Collections.max(dupChars.values());
		System.out.println("\n4. Highest occurred character(s) in the String:");
		for (Entry<Character, Integer> n : dupChars.entrySet()) 
			if (n.getValue() == maxValue)
				System.out.println(n);
	}

}



