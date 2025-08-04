package ReturnStatementCases;

public class ReturnTest3 {

		public int m1() {
			
			try {
				System.out.println("I am in try Block");
				return 50;
			}
			catch(Exception e)
			{
				System.out.println("i am in catch Block");
			}
			return 50;
			
			//System.out.println("Statement After Return");//Unreachable Code
			
		}
		
		public static void main(String[] args) {
			
			ReturnTest3 rt=new ReturnTest3();
			System.out.println(rt.m1());
		}
		
			
		}



