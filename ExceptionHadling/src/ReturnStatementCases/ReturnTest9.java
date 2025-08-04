package ReturnStatementCases;
//Return Statement in try catch finally block
public class ReturnTest9 {
	//Return Statement in try & finally block
	

	

		public int m1() {
									
					try {
						System.out.println("I am in try Block");
						return 30;
							}
							finally
							{
								System.out.println("i am in finally Block");
									return 50;
							}
								
							}
								
					public static void main(String[] args) {
									
							ReturnTest9 rt=new ReturnTest9();
							System.out.println(rt.m1());
						}
								
									
						}
