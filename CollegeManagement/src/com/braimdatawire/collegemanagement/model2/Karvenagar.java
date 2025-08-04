package com.braimdatawire.collegemanagement.model2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.braimdatawire.collegemanagement.model.Batch;
import com.braimdatawire.collegemanagement.model.Cjc;
import com.braimdatawire.collegemanagement.model.Course;
import com.braimdatawire.collegemanagement.model.Faculty;
import com.braimdatawire.collegemanagement.model.Student;
public class Karvenagar implements Cjc {
	

		Scanner sc = new Scanner(System.in);
		

		List<Course> clist = new ArrayList<>();

		List<Faculty> flist = new ArrayList<>();

		List<Batch> blist = new ArrayList<>();

		List<Student> slist = new ArrayList<>();

		@Override
		public void addCourse() {
			 Course c = new Course();
			System.out.println("Enter Course Id");
			c.setCid(sc.nextInt());

			System.out.println("Enter Course Name");
			c.setCname(sc.next());

			clist.add(c);
			
		}

		@Override
		public void viewCourse() {
			Iterator<Course> itr = clist.iterator();
			while (itr.hasNext()) {
				Course c1 = itr.next();
				System.out.println("Course Id :-" + c1.getCid());
				System.out.println("Course Name:-" + c1.getCname());
			}

		}

		@Override
		public void addFaculty() {
			Faculty f = new Faculty();
			System.out.println("Enter Faculty Id");
			f.setfId(sc.nextInt());

			System.out.println("Enter Faculty Name");
			f.setFname(sc.next());
			
			System.out.println("Enter course name : ");
			String cs = sc.next();
			
			Iterator<Course> itr = clist.iterator();
			while (itr.hasNext()) {
				Course c = itr.next();
				if(c.getCname().equals(cs));
				{
					System.out.println("Course Id :-" + c.getCid());
					System.out.println("Course Name:-" + c.getCname());
				}
			}
			System.out.println("Enter Course id from above Courses : ");
			int cid = sc.nextInt();
			
			Iterator<Course> itr1 = clist.iterator();
			while (itr1.hasNext()) {
				Course c1 = itr1.next();
				if(c1.getCid() == cid);
				{
					f.setCourse(c1);
				}
			}
			

			flist.add(f);

		}

		@Override
		public void viewFaculty() {
			Iterator<Faculty> itr = flist.iterator();
			while (itr.hasNext()) {
				Faculty f1 = itr.next();
				System.out.println("Faculty Id :-" + f1.getfId());
				System.out.println("Faculty Name:-" + f1.getFname());
				System.out.println("Course Id :-" + f1.getCourse().getCid());
				System.out.println("Course Name :-" + f1.getCourse().getCname());
			}
		}

		@Override
		public void addBatch() {
			Batch b = new Batch();
			
			System.out.println("Enter Batch Id");
			b.setBid(sc.nextInt());
			
			System.out.println("Enter Batch name");
			b.setBname(sc.next());
			
			System.out.println("Enter Faculty Name");
			String fn =sc.next(); 
			
			Iterator<Faculty> itr = flist.iterator();
			while (itr.hasNext()) {
				Faculty f1 = itr.next();
				if(f1.getFname().equals(fn));{
				System.out.println("Faculty Id :-" + f1.getfId());
				System.out.println("Faculty Name:-" + f1.getFname());
				System.out.println("Course Id :-" + f1.getCourse().getCid());
				System.out.println("Course Name :-" + f1.getCourse().getCname());
				}
			}
			
			System.out.println("Enter Faculty id from above Courses : ");
			int fid = sc.nextInt();
			
			Iterator<Faculty> itr2 = flist.iterator();
			while (itr2.hasNext()) {
				Faculty f1 = itr2.next();
				if(f1.getfId() == fid);
				{
					b.setFaculty(f1);
				}
			}
			

			blist.add(b);

			
		}

		@Override
		public void viewBatch() {
			Iterator<Batch> itr = blist.iterator();
			while (itr.hasNext()) {
				Batch b1 = itr.next();
				System.out.println("Batch Id :-"+b1.getBid());
				System.out.println("Batch Name :-"+b1.getBname());
				System.out.println("Faculty Id :-" + b1.getFaculty().getfId());
				System.out.println("Faculty Name:-" + b1.getFaculty().getFname());
				System.out.println("Course Id :-" + b1.getFaculty().getCourse().getCid());
				System.out.println("Course Name :-" + b1.getFaculty().getCourse().getCname());
			}
		}

		/*
		 * @Override public void addStudent() { Student s = new Student();
		 * 
		 * System.out.println("Enter Student Id"); s.setSid(sc.nextInt());
		 * 
		 * System.out.println("Enter Student name"); s.setSname(sc.next());
		 * 
		 * System.out.println("Enter Batch Name"); String sn =sc.next();
		 * 
		 * Iterator<Batch> itr = blist.iterator(); while (itr.hasNext()) { Batch b1 =
		 * itr.next(); if(b1.getBname().equals(sn));{
		 * System.out.println("Batch Id :-"+b1.getBid());
		 * System.out.println("Batch Name :-"+b1.getBname());
		 * System.out.println("Faculty Id :-" + b1.getFaculty().getfId());
		 * System.out.println("Faculty Name:-" + b1.getFaculty().getFname());
		 * System.out.println("Course Id :-" + b1.getFaculty().getCourse().getCid());
		 * System.out.println("Course Name :-" +
		 * b1.getFaculty().getCourse().getCname()); } }
		 * 
		 * System.out.println("Enter Batch id from above Courses : "); int sid =
		 * sc.nextInt();
		 * 
		 * Iterator<Batch> itr3 = blist.iterator(); while (itr3.hasNext()) { Batch b1 =
		 * itr3.next(); if(b1.getBid() == sid); { s.setBatch(b1); } }
		 * 
		 * slist.add(s); }
		 * 
		 * @Override public void viewStudent() { Iterator<Student> itr =
		 * slist.iterator(); while (itr.hasNext()) { Student s1 = itr.next();
		 * 
		 * System.out.println("Student Id :-"+s1.getSid());
		 * System.out.println("Student Name :-"+s1.getSname());
		 * System.out.println("Batch Id :-"+s1.getBatch().getBid());
		 * System.out.println("Batch Name :-"+s1.getBatch().getBname());
		 * System.out.println("Faculty Id :-" + s1.getBatch().getFaculty().getfId());
		 * System.out.println("Faculty Name:-" + s1.getBatch().getFaculty().getFname());
		 * System.out.println("Course Id :-" +
		 * s1.getBatch().getFaculty().getCourse().getCid());
		 * System.out.println("Course Name :-" +
		 * s1.getBatch().getFaculty().getCourse().getCname()); } }
		 */
	//1}
public void addStudent() {
	Student s=new Student();
	
	System.out.println("Enter Student Id");
	s.setSid(sc.nextInt());
	System.out.println("Enter Student Name");
	s.setSname(sc.next());
	
	Batch b=new Batch();
	Faculty f=new Faculty();
	Course c=new Course();
	
	s.setBatch(b);
	System.out.println("Enter Batch Id");
	b.setBid(sc.nextInt());
	System.out.println("Enter Batch Name");
	b.setBname(sc.next());
	
	b.setFaculty(f);
	System.out.println("Enter Faculty Id");
	f.setfId(sc.nextInt());
	System.out.println("Enter Faculty Name");
	f.setFname(sc.next());
	
	f.setCourse(c);
	System.out.println("Enter Course Id");
	c.setCid(sc.nextInt());
	System.out.println("Enter Course Name");
	c.setCname(sc.next());
	
	
	
}

@Override
public void viewStudent() {
	Iterator<Student>st=slist.iterator();
			while(st.hasNext()) {
				Student ss=st.next();
				System.out.println(ss.getSid());
				System.out.println(ss.getSname());
				
				System.out.println(ss.getBatch().getBid());
				System.out.println(ss.getBatch().getBname());
				
				System.out.println(ss.getBatch().getFaculty().getfId());
				System.out.println(ss.getBatch().getFaculty().getFname());
				
				System.out.println(ss.getBatch().getFaculty().getCourse().getCid());
				System.out.println(ss.getBatch().getFaculty().getCourse().getCname());
				
			}
	
	
}



}
