package ReturnStatementCases;

public class ReturnTest4 {
	

			public int m1() {
				
				try {
					System.out.println("I am in try Block");
					int x=10/0;
					return 50;
				}
				catch(ArithmeticException e)
				{
					System.out.println("i am in catch Block");
				}
				return 20;
				
				
			}
			
			public static void main(String[] args) {
				
				ReturnTest4 rt=new ReturnTest4();
				System.out.println(rt.m1());
			}
			
				
			}

