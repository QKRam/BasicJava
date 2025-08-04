package MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TaskT {

	public static void main(String[] args) {
		
		List<Student>bsc=new ArrayList();
			Student s1=new Student(1,"Mahesh");
			Student s2=new Student(2,"Ganesh");
			bsc.add(s1);
			bsc.add(s2);
			
			List<Student>bcom=new ArrayList();
			Student s3=new Student(3,"Akash");
			Student s4=new Student(4,"Hardik");
			bcom.add(s3);
			bcom.add(s4);
			Map<String,List<Student>>dep1=new HashMap<>();
			dep1.put("Bsc", bsc);
			dep1.put("Bcom", bcom);
			
			List<Student>eng=new ArrayList();
			Student s5=new Student(1,"Durgesh");
			Student s6=new Student(2,"Rajesh");
			eng.add(s5);
			eng.add(s6);
			
			List<Student>bTeck=new ArrayList();
			Student s7=new Student(1,"Kishan");
			Student s8=new Student(2,"Yuvraj");
			bTeck.add(s7);
			bTeck.add(s8);
			Map<String,List<Student>>dep=new HashMap<>();
			dep.put("Eng", eng);
			dep.put("BTeck", bTeck);
			
			
			
			Map<String,Map<String,List<Student>>>deogiri=new HashMap<>();
			deogiri.put("Technical Dep", dep);
			deogiri.put("General DEp", dep1);
			
			//Set<String>keys=deogiri.keySet();
			
			System.out.println("======By Using Lambada=========");
			deogiri.forEach((v,k)->
			{
				System.out.println(v);
				System.out.println(k);
			}
					
				
					
	);
			
			System.out.println("====================");
			
			
				}
			
			
			
			
	}

