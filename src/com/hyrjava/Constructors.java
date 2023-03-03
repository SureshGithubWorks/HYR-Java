package com.hyrjava;

/*
 * CONSTRUCTORS
 * 
 * Def : Block of code similar to the method. It is called when an instance
 * (Object) of the class is created.
 * 
 * Default or Implicit constructor--> Java creates a contructor by default
 *
 * Explicit constructor--> Once we create an explicit constructor then Java
 * cannot create implicit constructor(This is user resposibility)
 * 
 * syntax--> public/protected/private->constructorName()
 * 			 public/protected/private->constructorName(parameterized)
 * 
 */

public class Constructors {

	public int i;

	public static void main(String[] args) {
		Constructors c = new Constructors("KSS");
		System.out.println(c.i);
	}

	public Constructors() {
		i = 20;

	}

	public Constructors(int a) {
		i = a;

	}

	public Constructors(String s) {
		System.out.println(s);

	}

}
