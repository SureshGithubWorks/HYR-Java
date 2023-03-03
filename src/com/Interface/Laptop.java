package com.Interface;

/*	INTERFACE
 * 	 Def:-
 * 		Interface is the blueprint of Class
 *  Untill JAVA 7 we cannot implement the extra methods (should be in public) 
 *  in interface but JAVA 8 onwards we can implement method explicitly (should be default or static)
 *	
 *	The methods which are created in the interface class are abstracts
 */

public interface Laptop {

	public void copy();	

	public void paste();

	public void cut();

	public void keyboard(); // Untill JAVA 7

	// from JAVA 8

	default void security() { // default key indicates that this implementation is only for
								// implementers(should call by creating objects)
		commonCode();
		System.out.println("Please implement security code");

	}

	static void audio() { // static key indicates that this implementation can use anyone(can call by
							// using className-> because of static)
		commonCode();
		System.out.println("Please implement audio code");
	}

	private static void commonCode() { // private method is introduced if there are any commonCode in methods-->to
										// overcome the code duplication
		System.out.println("Common code");
	}
}
/*
 * We cannot use commonCode in audio method because commonCode is nonstatic but
 * we can use inside security method
 * 
 * If we supposed to use commonCode in audio then make private method also in static
 */

/*
 * Question Can we provide implementation within interface ? ans:- Yes, but only
 * after Java 8 version
 */
