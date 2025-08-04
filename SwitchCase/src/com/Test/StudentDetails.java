package com.Test;

	import java.util.Scanner;

	public class StudentDetails implements Operations {

		Student s = new Student();
		Scanner sc = new Scanner(System.in);

		@Override
		public void registerUser() {

			System.out.println("Enter Student RollNo : ");
			s.setRollNo(sc.nextInt());
			System.out.println("Enter Student Name : ");
			s.setStuName(sc.next());
			System.out.println("Enter Student Fees : ");
			s.setFees(sc.nextDouble());
			System.out.println("Enter Student Mobile No : ");
			s.setStuMobileNo(sc.nextLong());

		}

		@Override
		public void getDetails() {
			if (s != null) {
				System.out.println("Student Details : ");
				System.out.println(s.getRollNo());
				System.out.println(s.getStuName());
				System.out.println(s.getFees());
				System.out.println(s.getStuMobileNo());
			} else {
				System.out.println("User Not Found..!");
				System.out.println("1. Create New User /n2. Return");
				int ch = sc.nextInt();
				if (ch == 1) {
					s = new Student();
					registerUser();
				}
			}
		}

		@Override
		public void updateUser() {
			if (s != null) {	
				boolean f = true;
				while (f) {
					System.out.println("What you wants to Update ? ");
					System.out.println("1. RollNo\n2. Name \n3. Fees \n4. Mobile No \n5. Return");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Current Roll No : " + s.getRollNo());
						System.out.println("Enter New Roll No : ");
						s.setRollNo(sc.nextInt());
					} else if (choice == 2) {
						System.out.println("Current Name : " + s.getStuName());
						System.out.println("Enter New Name : ");
						s.setStuName(sc.next());
					} else if (choice == 3) {
						System.out.println("Current Fees : " + s.getFees());
						System.out.println("Enter new Fee : ");
						s.setFees(sc.nextDouble());
					} else if (choice == 4) {
						System.out.println("Current Mobile Number : " + s.getStuMobileNo());
						System.out.println("Enter New Mobile No : ");
						s.setStuMobileNo(sc.nextLong());
					} else if (choice == 5) {
						f = false;
					} else {
						System.out.println("Invalid choice");
					}
				}
			} else {
				System.out.println("User Not Found..!");
				System.out.println("1. Create New User /n2. Return");
				int ch = sc.nextInt();
				if (ch == 1) {
					s = new Student();
					registerUser();
				}
			}
		}

		@Override
		public void deleteUser() {

			s = null;
			System.out.println("Student is Deleted..!");

		}

	}


