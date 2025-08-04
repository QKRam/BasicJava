package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortElement {

	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<>();
		
		al.add(3); 
		al.add(1);
		al.add(3);
		al.add(2);
		
		//System.out.println(al);
		
		/*
		 * Set<Integer>s=new TreeSet<>(al); //only sort = 1 2 3 
		 * System.out.println(s);
		 */
		Collections.sort(al);  //Sort With Duplicate=1 2 3 3
		System.out.println(al);
	}
}
