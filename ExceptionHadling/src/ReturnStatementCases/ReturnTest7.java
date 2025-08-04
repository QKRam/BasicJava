package ReturnStatementCases;

public class ReturnTest7 {//Return Statement in catch block
	//but no exception in try block

						public int m1() {
							
							try {
								System.out.println("I am in try Block");
								
								
							}
							catch(Exception e)
							{
								System.out.println("i am in catch Block");
								return 30;
							}
							return 100;
						}
						
						public static void main(String[] args) {
							
							ReturnTest7 rt=new ReturnTest7();
							System.out.println(rt.m1());
						}
						
							
						}
