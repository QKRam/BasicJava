package ReturnStatementCases;
//Return Statement in try catch finally block

public class ReturnTest10 {//Return Statement in try & finally block
	
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
										
								ReturnTest10 rt=new ReturnTest10();
								System.out.println(rt.m1());
							}
									
										
							}


