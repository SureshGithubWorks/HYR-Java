package com.Exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Scanner

public class Program2 {

	public static void main(String[] args) throws IOException {
		File f = new File("./sample.txt");
		if(!f.exists())
		f.createNewFile();
		
		Scanner s = new Scanner(f);
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		s.close();
	}

}
