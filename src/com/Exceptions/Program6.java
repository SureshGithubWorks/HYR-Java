package com.Exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// FileWriter

public class Program6 {

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
		
		String s = "Hello FileWriter";
		fr.write(s);
			
		fr.flush();		// Optional
		fr.close();
	}

}
