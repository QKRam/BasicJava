package com.SyntaxRule;

public class D extends C {

	public void m4() {
		
		C c=new C();
		//System.out.println(c.x);need to child class reference
		System.out.println(x);
		
		D d=new D();
		System.out.println(d.x);
	}
}
