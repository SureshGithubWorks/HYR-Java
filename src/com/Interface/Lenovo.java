package com.Interface;

// Note we can remove "@Override" annotation in all implemented methods
// Use ctrl + F to replace the common words in methods 

public class Lenovo implements Laptop {

	@Override
	public void copy() {
		System.out.println("Lenova copy code");

	}

	@Override
	public void paste() {
		System.out.println("Lenova paste code");

	}

	@Override
	public void cut() {
		System.out.println("Lenova cut code");

	}

	@Override
	public void keyboard() {
		System.out.println("Lenova keyboard code");

	}

	public void capture() {
		System.out.println("Lenova camera capture code");
	}

	@Override // this annotation is user wish (may type or not)
	public void security() {
		System.out.println("Lenovo security code");
	}

	static void audio() {
		System.out.println("Please implement audio code");
	}

}
