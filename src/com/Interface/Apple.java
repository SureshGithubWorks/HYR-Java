package com.Interface;

//Note we can remove "@Override" annotation in all implemented methods

public class Apple implements Laptop {

	@Override
	public void copy() {
		System.out.println("Apple copy code");

	}

	@Override
	public void paste() {
		System.out.println("Apple paste code");

	}

	@Override
	public void cut() {
		System.out.println("Apple cut code");

	}

	@Override
	public void keyboard() {
		System.out.println("Apple keyboard code");

	}

	@Override // this annotation is user wish (may type or not)
	public void security() {
		System.out.println("Lenovo security code");
	}

	static void audio() {
		System.out.println("Please implement audio code");
	}

}
