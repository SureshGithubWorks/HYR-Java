package com.Exceptions;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\SURESH\\resume.txt");  // we can create file in current directory by using "./resume.txt"
		if(f.exists())
			f.delete();
		//System.out.println(f.createNewFile());
		System.out.println(f.isHidden());
		System.out.println(f.canWrite());  //if false
		f.setWritable(true);
	}

}
