package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	

	public static void main(String[] args) {
		
		Map<Integer,String>mp=new HashMap<>();
		
		mp.put(1, "Mahesh");
		mp.put(3, "Ganesh");
		mp.put(4, "Kiran");
		mp.put(2, "Suhas");
		
		System.out.println(mp);//print as per insertion order
		
		//Set<Integer>keys=mp.keySet();
		
		/*Iterator<Integer>itr=keys.iterator();
		while(itr.hasNext()) {
			int x=itr.next();
			System.out.println(x);
			
			String val=mp.get(x);
			System.out.println(val);//sort and print
*/		
		//}
		/*
		 * for(int k:keys) { System.out.println(); String val=mp.get(k);
		 * System.out.println(k+" "+val);
		 * 
		 * }
		 */
		
		//m.forEach(val,key)-> System.out.println(""+key+""val);
	}
}
