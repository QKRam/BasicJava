package com.calculation;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int x=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int y=sc.nextInt();
		
		while(true)
		{
			System.out.println("1 Addition\n 2Substraction\n 3Division\n 4Multiplcation");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				
				System.out.println("x="+""+x+"\n"+"y="+""+"x+y="+(x+y));
					break;
					
					
			case 2:
				System.out.println("x="+""+x+"\n"+"y="+""+"x-y="+(x-y));
					break;
					
			case 3:
				System.out.println("x="+""+x+"\n"+"y="+""+"x/y="+(x/y));
					break;
					
			case 4:
				System.out.println("x="+""+x+"\n"+"y="+""+"x*y="+(x*y));
					break;
					
			case 5:
				System.out.println("Thank You");
				System.exit(0);
				
				default:
				System.out.println("Plz Enter Correct Number");
				
			}
			
			
			
			
		}
		
		
	}
}
