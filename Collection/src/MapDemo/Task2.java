package MapDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		
		Set<Integer>aaa=new HashSet<>();
		
			aaa.add(10);
			aaa.add(20);
			aaa.add(30);
			
		List<Integer>bbb=new ArrayList();
			bbb.add(101);
			bbb.add(105);
			bbb.add(108);
			bbb.add(109);
			
		Map<String,Collection<Integer>>ccc=new HashMap();
			ccc.put("A", aaa);
			ccc.put("B", bbb);
			
			Set<String>key=ccc.keySet();
			
			for(String ke:key) {
				System.err.println(ke);
				Collection<Integer>cl=ccc.get(ke);
				for(int x:cl) {
					System.out.println(x);
					
				}
			}
			System.out.println("========Lambda Exp========"+ "");
			
			
			ccc.forEach((k,v)->System.out.println(k+" "+v));
			
			
			
					}
}
