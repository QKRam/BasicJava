package com.ClassWork;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("Main==Start");
		
		try
		{
			int x=10/0; ////java.lang.ArithmeticException: / by zero
		}
		catch (ArithmeticException e) {
			System.out.println("Catch==Block");
		}
		
		System.out.println("Main==End");
	}
}

