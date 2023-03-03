package com.hyrjava;

/*	ARRAY
 * 	Array is a container which can hold multiple values of a single data type
 *  Array is non-primitive data type
 *  Types
 *   1.Single dimensional array
 *   2.Multi dimensional (Two dimentional and Jagged) array  
 */

public class Arrays {

	// Single dimentional array

	public static void main(String[] args) {
//		//int i[];
//		int[] j = new int[5]; // or we can write as--> int[] j = {5, 8, 4, 1} if we know the values 
//		j[0] = 5;
//		j[1] = 4;
//		j[2] = 8;
//		j[3] = 1;
//		
//		
//		for (int i = 0; i < j.length; i++) {
//			System.out.println(j[i]);
//			
//		}

		// Two dimensional array

		int[][] arr = new int[3][2]; // or we can write as--> int[][] arr = new {{1,2}, {3,4}, {4,5}};
										// or int[] arr = {
										// 				{1,2},
										// 				{3,4},
										//				{4,5}
										//			};

		arr[0][0] = 1;
		arr[0][1] = 2;

		arr[1][0] = 3;
		arr[1][1] = 4;

		arr[2][0] = 5;
		arr[2][1] = 6;

		// To iterate each value

//		for (int i = 0; i < arr.length; i++) {				// To iterate the rows
//			for (int j = 0; j < arr[i].length; j++) {		// To iterate the columns
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		// To print the overall size

		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			size += arr[i].length;
		}
		System.out.println(size);
	}
}