package List;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.PDLOverrideSupported;

public class Test {

	public static void main(String[] args) {
		
		List<Person>lp=new ArrayList<>();
		lp.add(new Person(101,"Akashay",95000,"Pune"));
		lp.add(new Person(102,"Amol",52000,"Mumbai"));
		lp.add(new Person(103,"Sakshi",37000,"Nagpur"));
		lp.add(new Person(104,"Soham",95000,"Pune"));
		lp.add(new Person(105,"Pramod",85000,"Satara"));
		lp.add(new Person(106,"Om",92000,"Goa"));
		lp.add(new Person(107,"Pratik",72000,"Pune"));
		System.out.println("========Max Value========");
		double maxSal = lp.get(0).getSalary();
		int f = 0;
		for(Person p : lp) {
			if(p.getSalary() > maxSal)
			{
				maxSal = p.getSalary();
				f = 1;
			}
		}
		if(f==0) {
			System.out.println("Max Salary : "+maxSal);
		}
		else {
			System.out.println("Max Salary : "+maxSal);
		}
		System.out.println("========********========");
	
	for(Person p:lp) {
		if(p.getSalary()>5000) {
			System.out.println(p);
		}
		
	}
	System.out.println("==========Or==============");
	lp.stream().filter((p)->p.getSalary()>50000).forEach(System.out::println);
	
	System.out.println("===========================================");
	
	lp.stream().filter((p)->p.getpName().startsWith("S")).forEach(System.out::println);
	
	System.out.println("===========================================");
	
	lp.stream().filter((p)->p.getCity().equals("Pune")).forEach(System.out::println);
	
}

}