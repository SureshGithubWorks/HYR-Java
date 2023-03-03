package com.Exceptionhandling;

/*	EXCEPTION
 * 	DEF:-
 * 		Exception is an event that occurs during the execution of a program
 * 		that disrupts the normal flow of instructions
 * 	TYPES:-
 * 		Checked Exception (compile-time exception )
 * 		Unchecked Exception (runtime exception)	
 *  Stack trace
 *  	Exception name --> java.lang.ArithmeticException
 *  	Exception message --> / by zero 
 * 		Exception line number
 * 		Methods information
 * 
 * 	Hierarchy of exceptions in java
 * 	
 *  Object
 *      Thowable
 * 			Exception
 * 				RuntimeException
 * 					IndexOutOfBoundsException
 * 					NullPointerException
 * 					ArithmeticException
 * 				IOException
 * 					FileNotFoundException
 * 				SQLException
 * 
 */				

public class ExceptionHandling {
	
	public static void main(String[] args) {
		System.out.println("Execution started");
		int firstNumber = 1;
		int secondNumber = 0;
		int result = 0;
		try {
			 result = firstNumber/secondNumber;

		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		//	throw e;	// to stop the execution throw an exception back to java
			throw new ArithmeticException("Don't devide the number with zero");    //  customized exception
		}
		
		finally {
			System.out.println("Finally block");
			
		}
		System.out.println("Output is: "+result);
		System.out.println("Execution ended");
		
		System.exit(0);   // This line is use to destroy the execution thread no code will be execute after this line
		
//		  catch(ArithmeticException e) {
//			System.out.println(e.getMessage()); // to get only message 
//			}
//		  catch(ArithmeticException e) {
//			System.out.println(Arrays.toString(e.getStackTrace())); // to get the error lines as array format
//		  }
//			a.printStackTrace();     //to get overall error message
	
	}

}
