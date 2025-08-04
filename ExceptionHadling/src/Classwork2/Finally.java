package Classwork2;

public class Finally {

	public static void main(String[] args) {
		
		try {
			System.out.println("Try Start");
			int x=10/0;
			System.out.println("Trye End");
		}
		catch(ArithmeticException e) {
			System.out.println("Catch Block");
		}
		finally {
			System.out.println("Finally Block");
		}
		System.out.println("Main End");
		
		
		//if we dont take a catch block then only execute try Start & Finally Block
	}
}
