package com.hyrjava;

/* VARIABLES (Case Sensitive)
 * 
 * Types of variables
 *
 * Instance variables (Non static)--> inside the class, outside the method
 * Class variables (static)--> inside the class, outside the method
 * Local variables --> Variables inside the method -->should not be static
 * Parameters --> Variables define inside the method but not initialize
 */

// We can use capital letters in variable when we have a constant values
// For example--> double MATH_PI = 3.14;

public class Variables {
	
	int rollNo = 100; 		//Instance variables (Non static)-->create an object
	String name = "Suresh";
	
	static int id = 123;	//Class variables (static)-->No need to create an object
	
	public static void main(String[] args) {
		Variables v = new Variables();
		System.out.println(v.rollNo);
		System.out.println(v.name);

		System.out.println(id); // calling directly without creating object beacause of statics
	}

}
