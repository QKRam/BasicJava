package com.braimdatawire.collegemanagement.model;
//import cjc.brainwire.collgemanagement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Karvenagar k=new Karvenagar();
		Scanner sc=new Scanner(System.in);
		boolean b=true;
		//System.out.println("jjjs");
		
		while(b)
		{
			System.out.println("Enter The Choice:"
						+"\n1.AddCourse \t2.VeiwCourse"
						+"\n3.AddFaculty \t4.veiwFaculty"
						+"\n5.AddBatch \t6.ViewBatch"
						+"\n7.AddStudent \t8.ViewStudent"
						+"\n9.Exit");
			
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				k.addCourse();
			break;
			
			case 2:
				k.viewCourse();
			break;
			
			case 3:
				k.addFaculty();
				break;
				
			case 4:
				k.viewFaculty();
			break;
				
			case 5:
				k.addBatch();
				break;
				
			case 6:
				k.viewBatch();
			break;
			
			case 7:
				k.addStudent();
				break;
				
			case 8:
				k.viewStudent();
				break;
				
			case 9:
				System.exit(0);
				
				default:
					System.out.println("Invalid Input");
				
			}
		}
	}
}
