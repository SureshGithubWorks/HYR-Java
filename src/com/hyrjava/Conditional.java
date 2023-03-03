package com.hyrjava;

/*
 * Conditional or Decision making statements Types
 * 
 * If, If-else and Switch
 *
 */

public class Conditional {

	public static void main(String[] args) {

		String examStatus = "pass";
		if (examStatus =="pass") {
			System.out.println("You have cleared assesment");
			System.out.println("Please wait for round 1");

			String round1Status = "pass";
			if (round1Status == "pass") {
				System.out.println("You have cleared round 1");
				System.out.println("Please wait for round 2");

				String round2Status = "pass";
				if (round2Status == "pass") {
					System.out.println("You have cleared round 2");
					System.out.println("Please wait for HR round");

					String hrRoundStatus = "pass";
					if (hrRoundStatus == "pass") {
						System.out.println("You have cleared all rounds");
						System.out.println("Congratulations!!!, You are eligible for this Post.");
					} else {
						System.out.println("Sorry you have not clear HR round");
						System.out.println("Better luck next time");
					}
				} else
					System.out.println("Not eligible for HR round");

			} else
				System.out.println("Not eligible for round 2");

		} else
			System.out.println("Not eligible for round 2");
		
	//Suppose else statement have only one satement then no need Curly braces 
	//Suppose else statement have multiple satements then we should mention those statements inside Curly braces 
//_______________________________________________________________________________________________________________________________________________________		
		
		// SWITCH OPERATIONS (Nested switch also can be use)

		int i = 6;
		switch (i) {
		case 1:
			System.out.println("This is the first statement");
			break;
		case 2:
			System.out.println("This is the second statement");
			break;
		case 3:
			System.out.println("This is the Third statement");
			break;
		case 4:
			System.out.println("This is the fourth statement");
			break;

		default:
			System.err.println("The input is invalid");
			break;

		/* If we want to execute the same code for both cases then write the code as below
		/*  case 1:
		/*  case 2:
		/*      System.out.println("This code is common for both cases");
		/*      break; 
		 */
		}

	}
}
