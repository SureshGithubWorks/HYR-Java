package com.pojo;

import java.io.Serializable;

/*	JAVA BEAN (This class is used if there is any requirement to tranfer data through network)
 * 		Def:- Java Bean class is an extended version of a POJO class
 * 			  also reffered as a serializable POJO class
 * 
 * Rules:-
 * --> It should be inmplements "serializable" interface 
 * --> It should have no-args constructor (implicitly java creates if we not create explicitly )
 * --> All the properties (Instance variables) should be private
 * --> It should have Getters and Setters (public) in order to access the properties
 * 
 */

public class JavaBeanStudent implements Serializable{
	
	private int id;
	private String name;
	private double rollNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRollNo() {
		return rollNo;
	}
	public void setRollNo(double rollNo) {
		this.rollNo = rollNo;
	}
	

}
