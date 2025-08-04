package Classwork2;

import java.text.NumberFormat;

public class Task {

	public static void main(String[] args) {
		
		try {
			String s=args[2];
			System.out.println(s);
			
			try {
				int x=Integer.parseInt(s);
				System.out.println(s);
				
				try {
					int n=10/x;
					System.out.println(n);
				}
				catch(ArithmeticException e) {
					System.out.println(e.getLocalizedMessage());
				}
				catch(NumberFormatException e) {
					System.out.println(e.getMessage());
				}
			}
			finally {
				System.out.println("Finally Block");
			}
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("End..!");
		
	}
}