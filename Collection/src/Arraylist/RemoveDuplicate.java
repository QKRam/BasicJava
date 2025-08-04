package Arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		
		System.out.println(al);
		
		/*
		 * Set<Integer>s=new HashSet(al); System.out.println(s);//20 10 30
		 */
		Set<Integer>s=new LinkedHashSet<>(al);
		System.out.println(s);
	}
}
