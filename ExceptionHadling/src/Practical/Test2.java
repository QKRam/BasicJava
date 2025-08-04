package Practical;
public class Test2 {

		public int m1() {
			
			int x=10;
			
			try {
				System.out.println("Try==Block");
				return x;
			}
			finally{
				x=30;
				System.out.println("Finally ==Block"+x);
				return x;
			}
			
		}
			public static void main(String[] args) { 
				Test2 t=new Test2();
				int x=t.m1();
				System.out.println(x);
				
			}
			
			
			
		}



