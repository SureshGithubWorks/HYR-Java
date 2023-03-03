package com.Interface;

//Note we can remove "@Override" annotation in all implemented methods

public class HP implements Laptop {

	@Override
	public void copy() {
		System.out.println("HP copy code");
	}

	@Override
	public void paste() {
		System.out.println("HP paste code");
	}

	@Override
	public void cut() {
		System.out.println("HP cut code");
	}

	@Override
	public void keyboard() {
		System.out.println("HP keyboard code");
	}

	public void printing() {
		System.out.println("HP printer code");
	}

	@Override // this annotation is user wish (may type or not)
	public void security() {
		System.out.println("Lenovo security code");
	}

	static void audio() {
		System.out.println("Please implement audio code");
	}

}
