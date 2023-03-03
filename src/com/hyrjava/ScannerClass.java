package com.hyrjava;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is your name ?");
		String name = s.nextLine();
		System.out.println("Welcome "+name);
		
		System.out.println("What is your empID ?");
		int id = s.nextInt();
		System.out.println("Your ID is "+id);
		
		System.out.println("What is your age ?");
		int age = s.nextInt();
		System.out.println("Your age is "+age);
		
		s.nextLine();
		
		System.out.println("What is your City ?");
		String city = s.nextLine();
		System.out.println("Your city is "+city);
		
		System.out.println("What is your City pincode ?");
		int pin = s.nextInt();
		System.out.println("Your city pincode is "+pin);
		
		s.nextLine();
		
		System.out.println("What is your city Location ?");
		String location = s.nextLine();
		System.out.println("Your city Location is "+location);
		
		s.close();
	}

}
