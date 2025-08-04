package ReturnStatementCases;

public class ReturnTest5 {

	

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
					
						
				}
				
				public static void main(String[] args) {
					
					ReturnTest5 rt=new ReturnTest5();
					System.out.println(rt.m1());
				}
				
					
				}
