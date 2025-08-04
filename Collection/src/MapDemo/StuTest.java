package MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StuTest {

	public static void main(String[] args) {
	
		List<Student>mba=new ArrayList<>();
		
			Student s1=new Student(1,"Mahesh");
			Student s2=new Student(2,"Somesh");
			mba.add(s1);
			mba.add(s2);
			
		List<Student>mca=new ArrayList<>();
		Student s3=new Student(3,"Durga");
		Student s4=new Student(4,"Alok");
		mba.add(s3);
		mba.add(s4);
		
		Map<String, List<Student>>clg=new HashMap();
		
			clg.put("MCA", mca);
			clg.put("MBA", mba);
			
			Set<String>keys=clg.keySet();
			
			for(String key:keys) {
				System.out.println(key);
				List<Student>list=clg.get(key);
				for(Student stu:list) {
					System.out.println(stu);
				}
			}
	}
}
