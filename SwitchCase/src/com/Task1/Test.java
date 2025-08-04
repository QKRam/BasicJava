package com.Task1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentDeatils st = new StudentDeatils();
		TeacherDetails td = new TeacherDetails();
		System.out.println("Choice:\n1.Student\t2.Teacher");
		int ch = sc.nextInt();
		if(ch==1)
		{
			while(true)
			{
				System.out.println("Choice :"
						+ "\n1.Register"
						+ "\n2.GetDetails"
						+ "\n3.update"
						+ "\t4.Delete"
						+ "\n5.Exit");
				
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					st.register();
					break;
				case 2:
					st.getDetails();
					break;
				case 3:
					st.update();
					break;
				case 4:
					st.deleteStudent();
					break;
				case 5:
					System.out.println("\tExit..");
					System.exit(0);
				
				default :
					System.out.println("Invalid Choice");
					break;
				}
			}
			
		}
		else if(ch==2)
		{
			while(true)
			{
				System.out.println("Choice :"
						+ "\n1.Register"
						+ "\n2.GetDetails"
						+ "\n3.update"
						+ "\t4.Delete"
						+ "\n5.Exit");
				
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					td.register();
					break;
				case 2:
					td.getDetails();
					break;
				case 3:
					td.update();
					break;
				case 4:
					td.delete();
					break;
				case 5:
					System.out.println("\tExit..");
					System.exit(0);
				
				default :
					System.out.println("Invalid Choice");
					break;
				}
			}
		}
		else
		{
			System.out.println("Invalid Choice...");
		}
		
	}

}

