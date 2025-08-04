package Classwork2;

public class Finally2 {

	public static void main(String[] args) {
		 int a[]= {3,5,7,0,8,3,1,0,66,88,9};
		 int l=a.length-1;
		 
		 while(1>=0) {
			 int n=a[l];
			 
			 try {
				 int x=10/n;
				 System.out.println(x);
				 
			 }
			 catch(ArithmeticException e) {
				 System.out.println("o is present at index="+l);
			 }
			 finally {
				 l--;
			 }
		 }
	}
}
