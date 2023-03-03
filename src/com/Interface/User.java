package com.Interface;

public class User {

	public static void main(String[] args) {

		Lenovo l = new Lenovo();
		l.copy();
		l.paste();
		l.cut();
		l.capture(); // Untill Java 7
						// from Java 8
		l.security();
		Laptop.audio();

		HP h = new HP();
		h.copy();
		h.paste();
		h.cut();
		h.printing(); // Untill Java 7
						// from Java 8
		h.security();
		Laptop.audio();

		Apple a = new Apple();
		a.copy();
		a.paste();
		a.cut(); // Untill Java 7
					// from Java 8
		a.security();
		Laptop.audio();

	}

}
