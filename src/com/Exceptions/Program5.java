package com.Exceptions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// FileoutputStream

public class Program5 {

	public static void main(String[] args) throws IOException {
		File f = new File("./sample.txt");
		if (f.exists())
			f.delete();
		f.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(f);
		
//		fos.write(56);
//		fos.write(69);
//		fos.write(88);
//		fos.write(56);
//		fos.write(77);
		
		String s = "Hello";
		for (char ch : s.toCharArray()) {
			fos.write(ch);
			
		}
		
		fos.flush();		// Optional
		fos.close();
	}

}
