package com.SyntaxRule;
import com.Syntax.*;
public class C extends A{

	A a=new A();
	
	public void m2()
	{
		//System.out.println(a.x); parent reference can't work directly
		System.out.println(x);
		
		C c=new C();
		System.out.println(c.x);
	}
	public static void main(String[] args) {
		
		System.out.println("Parents class variable doesent work in child class");
	}
}
