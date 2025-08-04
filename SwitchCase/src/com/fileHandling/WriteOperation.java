package com.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOperation {

	public static void main(String[] args) throws IOException {
		
		File f=new File("Yuvi.Java");
		
		FileWriter fw=new FileWriter(f,true);
		
		fw.write("Wellcome");
		
		fw.flush();
		
		fw.close();
		System.out.println("Wellcome");
	}
}
