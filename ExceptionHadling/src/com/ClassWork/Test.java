package com.ClassWork;

public class Test {

	public static void m1() {//if we use Static then Catch Block will not execute
		
		System.out.println("m1==Test");
	}
	
	public static void main(String[] args) {
		
		Test t=null;
		try
		{
			t.m1();
		}
		catch(NullPointerException e)
		{
			System.out.println("Catch==Block");
		}
		System.out.println("Main==End");
	}
}
