package com.hyrjava;

/*	STRINGS
 * 	-->	Strings is a sequence of characters and it is a class in java
 * 		but considered as a literal because of its unique behaviour
 * 	--> String is also a data type but not primitive
 */

public class Strings {
	
	public static void main(String[] args) {
	
		String s1 = "Hello world!"; // saves in string pool memory
		String s2 = new String("Welcome to JAVA"); // saves in heap memory
		
		// Lines 13 & 14 represents the unique behaviour of String
		
		System.out.println(s1); 
		System.out.println(s2);
		
		// s1 == s2 --> compares the addresses
		// s1.equals(s2) --> compares the data 
		
		// trim()--> use to remove spaces at starting and ending in string
		
		String s3 = "  ";
		String s4 = "";
		
		System.out.println(s3.length());
		System.out.println(s3.trim().isEmpty());
		System.out.println(s3.isBlank());
		
		System.out.println(s4.length());
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());
		
	}
}
