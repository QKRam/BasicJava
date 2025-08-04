package com.braimdatawire.collegemanagement.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Karvenagar implements Cjc {

	List<Course> clist=new ArrayList<>();
	List<Faculty> flist=new ArrayList<>();
	List<Batch> blist=new ArrayList<>();
	List<Student> slist=new ArrayList<>();

	Scanner sc=new Scanner(System.in);
	
	
	@Override
	public void addCourse() {
		
		 Course c=new Course();
		 
		 System.out.println("Enter Course Id");
		 c.setCid(sc.nextInt());
		 
		 System.out.println("Enter Course Name");
		 c.setCname(sc.next());
		 clist.add(c); 
		
	}

	@Override
	public void viewCourse() {
		
		Iterator<Course>cs=clist.iterator();
		while(cs.hasNext()) {
			
			Course cr=cs.next();
			System.out.println(cr.getCid());
			System.out.println(cr.getCname());
		}
		
	}

	@Override
	public void addFaculty() {
		
		Faculty f=new Faculty();
		System.out.println("Enter Faculty Id");
		f.setfId(sc.nextInt());
		
		System.out.println("Enter Faculty Name");
		f.setFname(sc.next());
		
		System.out.println("Enter Course Name:");
		String cc=sc.next();
		
		Iterator<Course>itr=clist.iterator();
		while(itr.hasNext()) {
			Course c=itr.next();
			if(c.getCname().equals(cc));
			{
				System.out.println("Course Id:-"+c.getCid());
				System.out.println("Course Name:-"+c.getCname());
			}
		}
		System.out.println("Enter Course Id From ABove Courses:");
		int cour=sc.nextInt();
		
		Iterator<Course>itr1=clist.iterator();
		while(itr1.hasNext()) {
			Course crs=itr1.next();
			if(crs.getCid()==cour);
			{
				f.setCourse(crs);
			}
		}
		flist.add(f);
		
	}

	@Override
	public void viewFaculty() {
		Iterator<Faculty>fc=flist.iterator();
		while(fc.hasNext()) {
			Faculty ft=fc.next();
			System.out.println(ft.getfId());
			System.out.println(ft.getFname());
			System.out.println("Course ID:-"+ft.getCourse().getCid());
			System.out.println("Course ID:-"+ft.getCourse().getCname());
		}
		
	}

	@Override
	public void addBatch() {
		Batch b=new Batch();
		System.out.println("Enter Batch Id");
		b.setBid(sc.nextInt());
		System.out.println("Enter Batch Name");
		b.setBname(sc.next());
		
		System.out.println("Enter Faculty Name;:-");
		String fc=sc.next();
		
		Iterator<Faculty>itr=flist.iterator();
		while(itr.hasNext()) {
			Faculty f=itr.next();
			if(f.getFname().equals(b));{
				System.out.println("Faculty Id :-" + f.getfId());
				System.out.println("Faculty Name:-" + f.getFname());
				System.out.println("Course Id :-" + f.getCourse().getCid());
				System.out.println("Course Name :-" + f.getCourse().getCname());
			}
		}
		System.out.println("Enter Faculty id from Above Course:-");
		int fid=sc.nextInt();
		
		Iterator<Faculty>itr2=flist.iterator();
		while (itr2.hasNext()) {
			Faculty f1 = itr2.next();
			if(f1.getfId() == fid);
			{
				b.setFaculty(f1);
			}
			blist.add(b);
		}
	}

	@Override
	public void viewBatch() {
		Iterator<Batch>b=blist.iterator();
		while(b.hasNext()) {
			Batch bt=b.next();
			System.out.println(bt.getBid());
			System.out.println(bt.getBname());
			System.out.println("Faculty Id :-" + bt.getFaculty().getfId());
			System.out.println("Faculty Name:-" + bt.getFaculty().getFname());
			System.out.println("Course Id :-" + bt.getFaculty().getCourse().getCid());
			System.out.println("Course Name :-" + bt.getFaculty().getCourse().getCname());
		}
		
	}

	@Override
	public void addStudent() {
		Student s=new Student();
		
		System.out.println("Enter Student Id");
		s.setSid(sc.nextInt());
		System.out.println("Enter Student Name");
		s.setSname(sc.next());
		
		System.out.println("Enter Batch Name");
		String sn=sc.next();
		
		Iterator<Batch> itr = blist.iterator();
		while (itr.hasNext()) {
			Batch b1 = itr.next();
			if(b1.getBname().equals(sn));{
			System.out.println("Batch Id :-"+b1.getBid());
			System.out.println("Batch Name :-"+b1.getBname());
			System.out.println("Faculty Id :-" + b1.getFaculty().getfId());
			System.out.println("Faculty Name:-" + b1.getFaculty().getFname());
			System.out.println("Course Id :-" + b1.getFaculty().getCourse().getCid());
			System.out.println("Course Name :-" + b1.getFaculty().getCourse().getCname());
			}
		}
		System.out.println("Enter Batch id from above Courses : ");
		int sid = sc.nextInt();
		
		Iterator<Batch> itr3 = blist.iterator();
		while (itr3.hasNext()) {
			Batch b1 = itr3.next();
			if(b1.getBid() == sid);
			{
				s.setBatch(b1);
			}
		}
		
		slist.add(s);
	}
	
	@Override
	public void viewStudent() {
		Iterator<Student>st=slist.iterator();
		while (st.hasNext()) {
			Student s1 = st.next();
			
			System.out.println("Student Id :-"+s1.getSid());
			System.out.println("Student Name :-"+s1.getSname());
			System.out.println("Batch Id :-"+s1.getBatch().getBid());
			System.out.println("Batch Name :-"+s1.getBatch().getBname());
			System.out.println("Faculty Id :-" + s1.getBatch().getFaculty().getfId());
			System.out.println("Faculty Name:-" + s1.getBatch().getFaculty().getFname());
			System.out.println("Course Id :-" + s1.getBatch().getFaculty().getCourse().getCid());
			System.out.println("Course Name :-" + s1.getBatch().getFaculty().getCourse().getCname());
					
				}
		
	}
		
}
