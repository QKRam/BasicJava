package Arraylist;

import java.util.*;

public class Sets {

	public static void main(String[] args) {
		
	Set<String> s=new HashSet<>();
	s.add("abc");
	s.add("efg");
	s.add("pqr");
	s.add("xyz");
	
	System.out.println(s);
	
	Iterator<String>itr=s.iterator();
	while(itr.hasNext()) {
		String s1=itr.next();
		System.out.println(s1);
		
		
	}
	}
}
