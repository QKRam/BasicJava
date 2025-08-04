		
	
	public class Student
	{
		int rollno;
		String name;
		
		public Student(int rollno, String name)   //Constructer
		{
			this.rollno=rollno;
			this.name=name;
	
		}
		public static void main(String[] args)
		{
		Student s1=new Student(1,"xyz");
		Student s2=new Student(2,"pqr");
		Student s3=new Student(3,"ABC");

		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s2.rollno);
		System.out.println(s2.name);
		System.out.println(s3.rollno);
		System.out.println(s3.rollno);
		}
		
	}