package com.Task1;


import java.util.*;

public class TeacherDetails {
	
	Scanner sc = new Scanner(System.in);
	Teacher ta[] = new Teacher[100];
	Teacher t = new Teacher();
	int size = 0;
	
	public void register()
	{
		boolean b = true;
		while(b)
		{
			System.out.println("Teacher Id : ");
			t.setTeachId(sc.nextInt());
			System.out.println("Teacher Name : ");
			t.setTeachName(sc.next());
			System.out.println("Teacher Sub : ");
			t.setTeachSub(sc.next());
			ta[size]=t;
			size++;
			
			System.out.println("Add More Teacher..?");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("NO"))
			{
				b = false;
			}
			
		}
	}
	
	public void getDetails()
	{
		System.out.println("Enter Teacher ID : ");
		int teach = sc.nextInt();
		int l=0;
		for(int i=0;i<size;i++)
		{
			if(ta[i].getTeachId()==teach)
			{
				System.out.println("Teacher Id : "+ta[i].getTeachId());
				System.out.println("Teacher Name : "+ta[i].getTeachName());
				System.out.println("Teacher Sub : "+ta[i].getTeachSub());
				l++;
				break;
				
			}
		}
		if(l==0)
		{
			System.out.println("Teacher Not Found..");
		}
	}
	public void update()
	{
		System.out.println("What Do You Update..\n1.Teacher Name \t2.Teacher Sub");
		int ch = sc.nextInt();
		int l = 0;
		if(ch==1)
		{
			System.out.println("Enter Teacher Id : ");
			int tid = sc.nextInt();
			for(int i=0;i<size;i++)
			{
				if(ta[i].getTeachId()==tid)
				{
					System.out.println("Enter New Name : ");
					ta[i].setTeachName(sc.next());
					l++;
					break;
				}
			}
			if(l==0)
			{
				System.out.println("\t Teacher Info Not Found..");
			}
			
		}
		else if(ch==2)
		{
			System.out.println("Enter Teacher Id : ");
			int tid = sc.nextInt();
			for(int i=0;i<size;i++)
			{
				if(ta[i].getTeachId()==tid)
				{
					System.out.println("Enter New Sub : ");
					ta[i].setTeachSub(sc.next());
					l++;
					break;
				}
			}
			if(l==0)
			{
				System.out.println("\t Teacher Info Not Found..");
			}

		}
	}
	
	public void delete()
	{
		int l = 0;
		System.out.println("Enter Teacher Id do you update..? : " );
		int tid = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(ta[i].getTeachId()==tid)
			{
				ta[i]=null;
				l++;
				System.out.println("\t Delete SucessFully..");
				break;
				
			}
		}
		if(l==0)
		{
			System.out.println("Teacher Not Found..");
		}
	}
	
	

}


