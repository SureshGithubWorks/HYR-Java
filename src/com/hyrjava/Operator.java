package com.hyrjava;

/*
 * Types of operators-->
 * 
 *  Arithmetic--> +,-,*,/,%
 *  Unary--> ++(Increment), --(Decrement)--> Pre, Post
 *  Relational--> ==, !=, >, <, >=, <= 
 *  Conditional--> &&, ||
 *  Assignment--> =, +=, -=, *=, /=, %=
 * 
 * 
 *
 */
public class Operator {
	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		System.out.println("Post and pre Increments");
		System.out.println(a); // same value
		System.out.println(++a); // Increment first then printed
		System.out.println(a);
		System.out.println(a++); // Print the original value then increment
		System.out.println(a); // Prints the incremented value in upper step
		System.out.println(" ");

		System.out.println("Post and pre Decrements");
		System.out.println(b); // same value
		System.out.println(--b); // Decrement first then printed
		System.out.println(b--); // Print the original value then Decrement
		System.out.println(b); // Prints the Decremented value in upper step
		System.out.println(" ");

		System.out.println("Multiple operations");
		int c = ++a + b-- - --a + b++;
		System.out.println(c);
		
	}

}
