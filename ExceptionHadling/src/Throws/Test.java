package Throws;

public class Test {

	public void m1() {
		
		System.out.println("m1=Start");
		
		B b=new B();
		
		try {
			b.m2();
		}
		catch(ArithmeticException e) {
			System.out.println("Catch=Block");
		}
		System.out.println("m1=End");
	}
	public static void main(String[] args) {
		System.out.println("Main=Start");
		Test t=new Test();
		
		try {
			t.m1();
			}
		catch(ArithmeticException e)
		{
			System.out.println("catch=Block");
		}
		System.out.println("main=End");
	}
}
