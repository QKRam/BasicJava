package ReturnStatementCases;

public class ReturnTest6 {

					public int m1() {
						
						try {
							System.out.println("I am in try Block");
							
							return 50;
						}
						catch(Exception e)
						{
							System.out.println("i am in catch Block");
							return 30;
						}
						//System.out.println("Method At End");Unrechable code.
						//So compile time error will occur	
					}
					
					public static void main(String[] args) {
						
						ReturnTest6 rt=new ReturnTest6();
						System.out.println(rt.m1());
					}
					
						
					}
