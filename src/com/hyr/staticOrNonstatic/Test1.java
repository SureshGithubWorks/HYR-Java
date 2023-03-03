package com.hyr.staticOrNonstatic;

import java.util.Random;

public class Test1 {

//	int number ;

//	public static void main(String[] args) {

//		Test1 t1 = new Test1();
//		t1.number = new Random().nextInt();
//		
//		Test1 t2 = new Test1();
//		t2.number = new Random().nextInt();
//		
//		Test1 t3 = new Test1();
//		t3.number = new Random().nextInt();
//		
//		System.out.println(t1.number);
//		System.out.println(t2.number);
//		System.out.println(t3.number);

//		If we execute the above program it gives different values in console
//		because number is nonstatic (allocates memory in Heap memory)
//		
//		If we change the number into static then it gives same number in console 
//		because number is static and (allocates memory in method area)
//		for static no need to create an object

	static int number;
	public static void main(String[] args) {

		Test1.number = new Random().nextInt();
		
		System.out.println(Test1.number);
	}
	public static void print() {
		System.out.println("Static method");

	}
	public void print2() {
		System.out.println("non-Static method");
	}
}