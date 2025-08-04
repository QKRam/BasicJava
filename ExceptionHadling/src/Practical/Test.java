package Practical;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Test {

		Scanner sc = new Scanner(System.in);
		
		public int setUserId()
		{
			System.out.println("Enter User Id : ");
			try {
				int i = sc.nextInt();
				return i;
			}
			catch (InputMismatchException e) {
				System.out.println("Enter valid user id..!");
				sc = new Scanner(System.in);
				int id = setUserId();
				
				return id;
			}
		}
		
		public String setUserName() {
			System.out.println("Enter username : ");
			String un = sc.next();
				try {
					un.charAt(4);
					if(un.length() > 15)
					{
						un.charAt(10000);
					}
					return un;
				}
				catch (StringIndexOutOfBoundsException e) {
					System.out.println("UserName must me greater than or equal to FIVE & less than or equal to 15");
					sc = new Scanner(System.in);
					String st = setUserName();
					return st;
				}
		
		}
		
		public long setMobileNo() {
			
			System.out.println("Enter Mobile Number  : ");
			String mob = sc.next();
			if(mob.length() == 10)
			{
				try {
					long m = Long.valueOf(mob);
					return m;
				}
				catch (NumberFormatException e) {
					System.out.println("Enter 10 Digit mobile number only..!");
					sc = new Scanner(System.in);
					long ll = setMobileNo();
					return ll;
				}	
			}
			else
			{
				try
				{
					mob.charAt(1000);
					return 0000000000l;
				}
				catch (StringIndexOutOfBoundsException e) {
					System.out.println("Enter 10 Digit mobile number only..!");
					sc = new Scanner(System.in);
					long ll = setMobileNo();
					return ll;
				}
			
			}
			
			
		}
		
		public static void main(String[] args) {
			
			Test t = new Test();
			
			int uid = t.setUserId();
			
			String name = t.setUserName();
			
			long mobile = t.setMobileNo();
			
			System.out.println("User Id : " + uid);
			System.out.println("User Name : " + name);
			System.out.println("Mobile No : " + mobile);
			
		}
		
	}


