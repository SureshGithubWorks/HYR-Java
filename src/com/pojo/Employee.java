package com.pojo;

/*	POJO
 *  	DEF:- Plain Old Java Object is called POJO--> it is simple java object, 
 *  		  which is not bound by any special restriction.
 *  Pojo class is used to store the multiple datas with different data types
 *  
 *  Rules for a class to be called as a POJO class
 *  
 *  (Mandatory)
 * --> It must be public
 * --> It should not implement any interfaces
 * --> It should not extend any classes 
 * --> It should not have any annotations specified
 *  
 *  (Optional)
 * --> It is recommended to make the properties (Instance variables) as private
 * 	   for improved security
 * --> It can have Getters and Setters in order to access the properties
 * 		(write Getters and Setters when we declare the variables as private otherwise no need) 
 */

public class Employee {
	
	private int Id;
	public String name;
	protected Double salary;
	
//	public Employee() {
//		System.out.println("Parameterless Constructor");
//	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	public int getId() {
		return Id;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
