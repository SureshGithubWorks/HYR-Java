package com.Encapsulation;

/* ENCAPSULATION
 * DEF:-
 * 		It is a mechanism of wrapping the data(variables) and code acting
 * 		on the data(methods) together as a single unit
 * 									(Or)
 * 		It describes the ability of an object to hide its data and methods
 * 		from the rest of the world
 * 
 * 		Use Getters and Setters--> to create get and set methods 
 */

public class Student {

	private int rollNumber;
	private String name;
	private boolean isAttended;

	public Student(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setStudentAttendence(boolean attendenceStatus) {
		if (!isAttended)
			isAttended = attendenceStatus;
		System.out.println("Teacher gave an attendence to the student");
	}

	public boolean getStudentAttendence() {
		System.out.println("Teacher accessed student attendence");
		return isAttended;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
