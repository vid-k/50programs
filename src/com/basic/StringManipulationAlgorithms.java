package com.temp;

public class StringManipulationAlgorithms {

	//using simple loop going from n to 0
	public static String revString1(String orig) {
		StringBuffer revStr = new StringBuffer("");
		char[] origAsArray = orig.toCharArray();
		for (int i=orig.length()-1; i>=0; i--) {
			revStr.append(origAsArray[i]);	
		}
		return revStr.toString();
	}
	
	//using recursion
	public static String revString2(String orig) {
	    if ((null == orig) || (orig.length() <= 1)) {
	        return orig; //at this point, recursion stops and returns
	    }
	    return revString2(orig.substring(1)) + orig.charAt(0);
	}
		
	//using split
	public static String revWordsInString1(String orig) {
		StringBuffer revStr = new StringBuffer("");
		String[] wordArray = orig.split(" ");
		for (int i=wordArray.length-1; i>=0; i--) {
			revStr.append(wordArray[i]); 
			if (i!=0)
				revStr.append(" ");
		}
		return revStr.toString();	
	}
	
	//using substring
	public static String revWordsInString2(String orig) {
		StringBuffer revStr = new StringBuffer("");
		int end = orig.length();
		for (int i=orig.length(); i > 0 ; i--) {
			if (orig.charAt(i-1) == ' ' || i-1 == 0) {
				revStr.append(orig.substring(i-1, end));
				end = i;
			}
		}
		return revStr.toString();	
	}

	//using split
	public static String revEachWordInString1(String orig) {
		StringBuffer revStr = new StringBuffer("");
		String[] wordArray = orig.split(" ");
		for (int i=0; i<wordArray.length; i++) {
			for (int j=wordArray[i].length()-1; j>=0;j--) {
				revStr.append(wordArray[i].charAt(j));
			}
			revStr.append(" ");
		}
		return revStr.toString();
	}
	
	//using loops
	public static String revEachWordInString2(String orig) {
		StringBuffer revStr = new StringBuffer("");
		StringBuffer temp = new StringBuffer("");
		for (int i=0; i<orig.length(); i++) {
			if (orig.charAt(i) == ' ' || i == orig.length()-1) {
				if (i == orig.length()-1)
					revStr.append(orig.charAt(orig.length()-1));
				for (int j=temp.length()-1; j>=0; j--) {
					revStr.append(temp.charAt(j)); //or replace this entire loop to revStr.append(temp.reverse())
				}
				revStr.append(" ");
				temp.delete(0,temp.length());	
			}
			else
				temp.append(orig.charAt(i));
		}
		return revStr.toString();
	}
		
	
	//anagram - ignore case! ignore spaces!
	public static boolean anagram(String s1, String s2) {
		int i, j;
				
		//s1 - remove spaces and covert to lowercase and convert to StringBuffer
		StringBuffer str1Buffer = new StringBuffer();
		str1Buffer.append(s1.toLowerCase());
		for (i=0; i<str1Buffer.length(); i++) {
			if (str1Buffer.charAt(i) == ' ')
				str1Buffer.delete(i, i+1);
		}
		
		//s2 - remove spaces and covert to lowercase and convert to StringBuffer
		StringBuffer str2Buffer = new StringBuffer();
		str2Buffer.append(s2.toLowerCase());
		for (j=0; j<str2Buffer.length(); j++) {
			if (str2Buffer.charAt(j) == ' ')
				str2Buffer.delete(j, j+1);
		}		
		
		//now after removing spaces, if the 2 words do not have the same length, they cannot be anagrams!
		if (str1Buffer.length() != str2Buffer.length())
			return false;
		
		for (i=0; i<str1Buffer.length(); i++)
			for (j=0; j<str2Buffer.length(); j++) {					
				if (str1Buffer.charAt(i) == (str2Buffer.charAt(j))) {
					str2Buffer.delete(j, j+1);
					break;
				}
			}
		if (str2Buffer.length() == 0)
			return true;
		else 
			return false;
	}
	
	
	public static void main(String[] args) {
		//Reverse a string.
		System.out.println("Reverse string - input : java is easy output: ysae si avaj");
		System.out.println("revString1 - " + revString1("java is easy"));
		System.out.println("revString2 - " + revString2("java is easy"));
		System.out.println("---------------------------------------------\n");
		
		//Reverse only order of words in a String. input : java is easy output: easy is java
		System.out.println("Reverse string by words - input : java is easy output: easy is java");
		System.out.println("revWordsInString1 - " + revWordsInString1("java is easy"));
		System.out.println("revWordsInString2 - " + revWordsInString2("java is easy"));
		System.out.println("---------------------------------------------\n");
		
		//Reverse only words in a string. input: java is easy output: avaj si ysae
		System.out.println("Reverse only words in a string - input: java is easy output: avaj si ysae");
		System.out.println("revEachWordInString1 - " + revEachWordInString1("java is easy"));
		System.out.println("revEachWordInString2 - " + revEachWordInString2("java is easy"));
		System.out.println("---------------------------------------------\n");
		
		//anagram
		System.out.println("anagram?");
		System.out.println(String.format("1979 is an anagram of 9917: %b", anagram("1979", "9917")));
		System.out.println(String.format("tea pot is an anagram of ate a top: %b", anagram("tea top", "ate a top")));
		System.out.println(String.format("Mother in law is an anagram of woman Hitler: %b", anagram("Mother in law", "woman Hitler")));
		System.out.println("---------------------------------------------\n");
		
	}
}


