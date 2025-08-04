package Comparable;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Set<Student> s=null;
		
		System.out.println("-----Select-----\n"
							+"1.RollNo Sort\n"
						+"2.Name Sort");
		
		int ch=sc.nextInt();
		if(ch==1);
		{
			Comparator<Student>crno=(o1,o2)->o1.getRollNo() .o2.getRollNo();
			s=new TreeSet<Student>(crno);
		}
		else if(ch==2) {
			Comparator<Student>crna=(o1,02)->o1.getName();
			
	}
	}
}
