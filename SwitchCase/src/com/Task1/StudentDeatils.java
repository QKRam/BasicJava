package com.Task1;

import java.util.Scanner;

public class StudentDeatils {
	
	Student sa[] =new Student[100];
	Scanner sc = new Scanner(System.in);
	int size = 0;
	int roll  = 1;
	//Student  s = new Student();
	
	public void register()
	{
		boolean b = true;
		while(b)
		{
			Student s = new Student();
			//System.out.println("Roll No :");
			s.setRollNo(roll);
			System.out.println("Your Roll : "+s.getRollNo());
			System.out.println("Name :");
			s.setName(sc.next());
			System.out.println("Address :");
			s.setAddress(sc.next());
			sa[size] = s;
			size++;
			roll++;
			
			System.out.println("Add more Student ..?");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("NO"))
			{
				b = false;
			}
		}
	}
	
	public void register(int id)
	{
//			Student s = new Student();
//			System.out.println("Roll No :");
//			s.setRollNo(sc.nextInt());
//			System.out.println("Name :");
//			s.setName(sc.next());
//			System.out.println("Address :");
//			s.setAddress(sc.next());
//			sa[id] = s;
		
		sa[id]=sa[size-1];
		size--;
	}
	
	public void getDetails()
	{
		System.out.println("\n Enter Roll : ");
		int rn = sc.nextInt();
		int f = 0;
		for(int i=0;i<size;i++)
		{
			//System.out.println("in loop");
			if(sa[i].getRollNo()==rn)
			{
				//System.out.println("In IF Condition");
				System.out.println("Roll No :"+sa[i].getRollNo());
				System.out.println("Name : "+sa[i].getName());
				System.out.println("Address : "+sa[i].getAddress());
				f=1;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("\n\t Student Not Found");
		}
	}
	
	public void update()
	{
		System.out.println("what You Update..\n1.Name \t2.Address ");
		int ch = sc.nextInt();
		int l = 0;
		if(ch==1)
		{
			System.out.println("Enter Student Roll No :");
			int rn = sc.nextInt();
			for(int i=0;i<size;i++)
			{
				if(sa[i].getRollNo()==rn)
				{
					System.out.println("Enter New Name:");
					sa[i].setName(sc.next());
					System.out.println("Update Sucessfully...");
					l++;
					break;
				}
				
			}
			if(l==0)
			{
				System.out.println("\tStudent Not Found..");
			}
		}
		else if(ch==2)
		{
			System.out.println("Enter Student Roll No :");
			int rn = sc.nextInt();
			for(int i=0;i<size;i++)
			{
				if(sa[i].getRollNo()==rn)
				{
					System.out.println("Enter New Address:");
					sa[i].setAddress(sc.next());
					System.out.println("Update Sucessfully...");
					l++;
					break;
				}
				
			}
			if(l==0)
			{
				System.out.println("\tStudent Not Found..");
			}
		}
	}
	
	public void deleteStudent()
	{
		System.out.println("Enter Student Roll No you have to Delete....");
		int rn = sc.nextInt();
		int l = 0;
		int ind = 0;
		for(int i = 0;i< size;i++)
		{
			if(sa[i].getRollNo()==rn)
			{
				sa[i]=null;
				ind = i;
				l++;
				System.out.println("Student Delete Sucessfully");
				break;
			}
		}
		if(l==1)
		{
			register(ind);
		}
		else {
			System.out.println("Student Not Found..");

		}
	}
	
	
	
	

}
