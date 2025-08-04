package com.Test;

	import java.util.Scanner;

	public class Test {
		
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				StudentDetails sd = new StudentDetails();
				System.out.println("Choose Operations to be performed on which User Type :");
				System.out.println("1. Student /n2. Teacher /n3. Staff");
				int choice = sc.nextInt();
				if(choice ==1)
				{
					boolean f = true;
					while(f) 
					{
						System.out.println("a. Register New User/n "
								+ "b. Get User Details/n"
								+ "c. Update User Details/n"
								+ "d. Delete User");
						char ch = sc.next().charAt(0);
						
						if(ch == 'a')
						{
							sd.registerUser();
						}
						else if(ch == 'b')
						{
							sd.getDetails();
						}
						else if(ch == 'c')
						{
							sd.updateUser();
						}
						else if(ch == 'd')
						{
							sd.deleteUser();
						}
						else if(ch == 'e')
						{
							f = false;
						}
						else
						{
							System.out.println("Invalid Choice");
						}
					}
				}
				
			}
		
	}



