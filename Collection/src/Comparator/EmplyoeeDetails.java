package Comparator;
import java.util.*;
public class EmplyoeeDetails {

  public static void main(String[] args) {
		Set<Employee> se = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose one type for sorting Employee data :"
				+ "\n1. Employee Id"
				+ "\n2. Employee Name"
				+ "\n3. Employee Salary");
		int ch = sc.nextInt();
		
		if(ch == 1) {
			Comparator<Employee> cid = (e1,e2)-> e1.getEmpId()-e2.getEmpId();
			se = new TreeSet<Employee>(cid);
		}
		else if(ch == 2) {
			Comparator<Employee> cid = (e1,e2)-> e1.getEmpName().compareTo(e2.getEmpName());
			se = new TreeSet<Employee>(cid);
		}
		else if(ch == 3) {
			Comparator<Employee> cid = (e1,e2)-> (int)(e1.getEmpSalary()-e2.getEmpSalary());
			se = new TreeSet<Employee>(cid);
		}
		else {
			System.out.println("invalid choice..!");
		}
		
		Employee e1 = new Employee();
		e1.setEmpId(104);
		e1.setEmpName("bbb");
		e1.setEmpSalary(34000.0);
		
		Employee e2 = new Employee();
		e2.setEmpId(101);
		e2.setEmpName("ppp");
		e2.setEmpSalary(94000.0);
		
		Employee e3 = new Employee();
		e3.setEmpId(103);
		e3.setEmpName("aaa");
		e3.setEmpSalary(54000.0);
		
		Employee e4 = new Employee();
		e4.setEmpId(102);
		e4.setEmpName("xxx");
		e4.setEmpSalary(14000.0);
		
		se.add(e1);
		se.add(e2);
		se.add(e3);
		se.add(e4);
		
		for(Employee e : se)
		{
			System.out.println(e);
		}
		
  }
}
	
	
