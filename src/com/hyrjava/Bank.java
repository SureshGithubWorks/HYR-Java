package com.hyrjava;

public class Bank {

	 static int currentBalance = 1000;

	public static void greetCustomer() {
		System.out.println("Welcome, Dear Customer!");
	}
		public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Amount is deposited successfully");
	}
		public static void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount is withrawn successfully");
	}
		public int getCurrentBalance() {
		return currentBalance;
	}
		public static void main(String[] args) {	//main
		Bank b = new Bank();
		greetCustomer();					//Static so no need to create an object 
		System.out.println("Mahaiii balance :"+b.getCurrentBalance());
		b.deposit(500);
		System.out.println(b.getCurrentBalance());
		withdrawal(300);					//Static so no need to create an object
		System.out.println(b.getCurrentBalance());

	}
}
