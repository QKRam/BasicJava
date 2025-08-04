package Classwork2;

public class MultipleCatch {

	public static void main(String[] args) {
		
		try {
			
			String s=args[0];
			int x=Integer.parseInt(s);
			int a=10/x;
		}
		catch(ArithmeticException e) {
			
			System.out.println("enter non zero value");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Enter Input Value");
		}
		catch(NumberFormatException e) {
			System.out.println("Enter Number");
		}
	}
}
