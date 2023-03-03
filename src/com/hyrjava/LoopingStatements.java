package com.hyrjava;

/* LOOPING STATEMENTS
 * 
 * Def : Looping statements are the statements that are execute 
 *       one or more statements repeatedly several number of times
 * 
 * TYPES
 * while, do-while, for and foreach 
 */

public class LoopingStatements {

	public static void main(String[] args) {

		// while concept

//		int i = 0;
//		while (i<10) {
//			System.out.println(i);
//			i++;
//		}

		// do-while concept

//		int i = 5;
//		do {
//			System.out.println(i); // Condition failed but minimum one time executed
//			i++;
//
//		} while (i < 5);
//
//	}

		// for loop concept
//		for (int i = 0; i < 10; i++) { // we can initialize "i" value globally when we want to reuse "i" value
//			System.out.println(i);
//		}

		// foreach/extended for concept (Single dimensional array)
		// syntax-->
		// for(dataType varName : arrayOrCollection)
		// {
		// Statements
		// }

//		int[] arr = {1,2,7,8,2,3,4,1};
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		for (int i : arr) {
//			System.out.println(i);
//		}
		// foreach/extended for concept (Multi dimensional array)

		int sum = 0;
		int noOfElements = 0;

		int[][] arr = { { 1, 2, 4 }, // singleDimensionalArray
				{ 7, 0, 3 }, // singleDimensionalArray
				{ 7, 9, 7 }, // singleDimensionalArray
				{ 1, 1, 5 } // singleDimensionalArray
		};

		for (int[] singleDimensionalArray : arr) {
			for (int value : singleDimensionalArray) {
				System.out.print(value + " ");
				sum += value;
				noOfElements++;
			}
			System.out.println();
		}
		System.out.println("Sum of all elements is " + sum);
		System.out.println("Average of all elements is " + sum / noOfElements);
	}

}