package com.Exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// BufferedWriter

public class Program7 {

	public static void main(String[] args) throws IOException {
		File f = new File("./sample.txt");
		if (f.exists())
			f.delete();
		f.createNewFile();
		
		FileWriter fr = new FileWriter(f);
		
//		fos.write(56);
//		fos.write(69);
//		fos.write(88);
//		fos.write(56);
//		fos.write(77);
		
		BufferedWriter br = new BufferedWriter(fr);
		String s = "Hello BufferedWriter";
		br.write(s);
			
		br.flush();		// Optional
		br.close();
	}

}
