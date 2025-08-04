package com.demo;

public class Student extends College {
	String clgName="Furgussion College";
	
	public void displayClgName()
	{
		System.out.println(super.clgName);
		System.out.println(clgName);
		
		
	
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.displayClgName();
		
		
	}
	

}
