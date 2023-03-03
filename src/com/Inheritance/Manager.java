package com.Inheritance;

public class Manager extends Developer {

	public void manage() {
		super.read();   // read() is in Guest & Manager class if we call read() then
						// it will executes the Manager class code, in case we want to
						// execute the Guest class read() then use "super.read()"
		write();
		System.out.println("Manager code");
	}

	public void read() {
		System.out.println("Updated read code");

	}

	public static void main(String[] args) {
		Manager m = new Manager();
		// m.read();
		m.write();
		m.manage();

	}

}
