package com.Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Scanner

public class Program4 {

	public static void main(String[] args) throws IOException {
		File f = new File("./sample.txt");
		if (!f.exists())
			
		f.createNewFile();

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String line = new String();
		while ((line = br.readLine()) != null) {
			System.out.println(line);

		}

		br.close();
	}

}
