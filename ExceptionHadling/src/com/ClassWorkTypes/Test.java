package com.ClassWorkTypes;

import java.util.Scanner;


import java.util.Scanner;

public class Test {

	Scanner sc = new Scanner(System.in);

	String st;
	
	public void m1(int x) {
			try {
			int y = 10/x;
			
			System.out.println(y);
			}
			catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
	
	public void m2() {
		try {
		int l = st.length();
		System.out.println(l);
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
			st = "java";
			m2();
		}
		
	}
	
	public void m3() {
		System.out.println("Enter a value : ");
		st = sc.next();
		System.out.println(st);
			try {
			int num = Integer.parseInt(st);
			System.out.println(num);
			}
			catch (NumberFormatException e) {
				System.out.println("Enter 0 - 9 digits only..!");
				m3();
			}

	}
	
	public double m4(int ind)
	{
		double d[]= {11.2, 33.5, 67.34, 89.00, 2334.90, 23456.7, 82334.9, 566.00};
		try {
			double di = d[ind];
			return di;	
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		return 0.0;
	}
	
	public void m5(String s) {
		st = s;
		System.out.println("Enter a index to find character at :");
		try {
			char ch = st.charAt(sc.nextInt());
			System.out.println(ch);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		t.m1(sc.nextInt());
		t.m2();
		t.m3();
		System.out.println("end..!");
		System.out.println("Enter index to find value : ");
		double dr = t.m4(sc.nextInt());
		System.out.println(dr);
		System.out.println("Enter a String value :");
		String s = sc.next();
		t.m5(s);	
	}
}
