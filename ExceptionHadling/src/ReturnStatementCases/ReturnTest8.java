package ReturnStatementCases;

public class ReturnTest8 {//Return Statement in catch block
	//but  exception occurred in try block

							public int m1() {
								
								try {
									System.out.println("I am in try Block");
								int x=20/0;
								System.out.println("result:"+x);
									
								}
								catch(ArithmeticException e)
								{
									System.out.println("i am in catch Block");
									return 30;
								}
								return 100;
							}
							
							public static void main(String[] args) {
								
								ReturnTest8 rt=new ReturnTest8();
								System.out.println(rt.m1());
							}
							
								
							}

