package com.Exceptions;

import java.io.File;
import java.io.FileInputStream;

/*	different ways to read the data from text files
 * 
 * --> FileInputStream
 * --> Scanner
 * --> FileReader
 * --> BufferedReader
 * 
 * 	FileInputStream is almost equal to FileReader
 * 
 *  different ways to read the data from text files
 * --> FileOutputStream
 * --> FileWriter
 * --> BufferedWriter
 * 		
 *	
 */

	//	FileInputStream

public class Program1 {

	public static void main(String[] args) throws Throwable {
		File f = new File("./sample.txt");
		if(!f.exists())
		f.createNewFile();
		FileInputStream fis = new FileInputStream(f);
		int ascciCode;
		while((ascciCode = fis.read()) !=-1) {
			System.out.println(ascciCode);      // it prints the real ascci code values
			System.out.print((char)ascciCode);	// to change real ascci code to readable format
		}
		fis.close();          // to ignore the data leackage
	}

}
