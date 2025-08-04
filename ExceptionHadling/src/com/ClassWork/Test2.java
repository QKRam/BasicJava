package com.ClassWork;

public class Test2 {
	
	public static void main(String[] args) {
		
		System.out.println("Main==Start");
		
		try
		{
			System.out.println("Try==Start");
			int x=10/0;
			System.out.println("Try==End");
		}
		catch (Exception e) {
			
			System.out.println("Catch==Block");
		}
		
	}

}
