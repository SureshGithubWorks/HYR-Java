package com.pojo;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setId(100);
		e1.name = "Suresh";
		e1.salary = 5555555.55;
		
		Employee e2 = new Employee();
		e2.setId(101);
		e2.name = "Naresh";
		e2.salary = 636746.399;
		
		Employee e3 = new Employee();
		e3.setId(102);
		e3.name = "Dhanush";
		e3.salary = 6737347.39;
		
		Employee[] emp = new Employee[] {e1, e2, e3};
 		for (Employee e : emp) {
			System.out.println(e.salary);
		} 			
			
		}
		
	}

