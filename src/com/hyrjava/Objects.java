package com.hyrjava;

/*   OBJECTS
 *  	Object is an instance of a class
 * 	Note : We can access an objects within same class 
 * 		   as well as outside the class (Consider access specifier)
 *
 */
public class Objects {
	int i;
	int j;

	public Objects() { // Parameterless constructor
		i = 10;
		j = 20;

	}

	public Objects(int i, int j) { // Parameterized constructor
		this.i = i;
		this.j = j;

	}

	public int add() {
		return i + j;

	}

	public static void main(String[] args) {
		Objects o1 = new Objects();
		Objects o2 = new Objects(15, 20);
		Objects o3 = new Objects(25, 30);
		
		// Methods calling
		System.out.println(o1.add());
		System.out.println(o2.add());
		System.out.println(o3.add());
		
		// variables calling
		System.out.println(o1.i);
		System.out.println(o3.j);
		
		// Checking both are equal or not 
		System.out.println(o1 == o2);
		System.out.println(o2 == o3);
		
	}

}
