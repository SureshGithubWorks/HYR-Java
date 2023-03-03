package com.hyr.staticOrNonstatic;

public class Test2 {

//	public static void main(String[] args) {
//		Test1.print();				// static method can call directly
//		
//		Test1 t1 = new Test1();		// non static method should be call by creating Object
//		t1.print2();
//	}
//}

// BLOCKS

	static {
		System.out.println("static block");
	}

	{
		System.out.println("non-static block");  // non-static blocks executes only after the creation of Objects
	}

	public Test2() {
		System.out.println("constructor block"); // contructors also executes only after the creation of Objects
	}

	public static void main(String[] args) {
		System.out.println("main method");
		
// we can create 'n' number of static blocks it doesn't shows duplicate and executes in same order that we prefered
// we cannot call non-static methods in static methods directly, we can call by creating objects but we can do vice-versa
	
	}
}