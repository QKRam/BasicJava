package Inheritance;

public class Test {

	public static void main(String[] args) {
		
		// Object

		Child p = new Child();// if we make a Object of a child class then we
								// -will access properties of both class(parent &Child)
		p.m1();
		p.m2();
		p.m3();
		
		//Variable Rule
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.c);
		
		
		//Reference
		/*
		 * Parent pr=new Child();
		 *  pr.m1();
		 *   pr.m2();
		 * 
		 * pr.m3();===if we create a object by using reference of a parent class then we
		 * will check method & compiler rule
		 * 
		 * System.out.println(pr.a);
		 * in case of variable running & compiling starts from reference class
		 */
	}
}
