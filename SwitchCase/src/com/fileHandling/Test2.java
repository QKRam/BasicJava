package com.fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the File Name");
		String s=sc.next();
		
		File f=new File("C:\\Users\\Admin\\Desktop\\MMM",s);
		boolean b=f.createNewFile();
		
		if(b==false)
		{
			System.out.println("File Not Created");
		}
		else
		{
			System.out.println("File Created Succesfully");
		}
	}
}
