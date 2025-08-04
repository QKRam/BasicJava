package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		
	
	Map<String, String>m1=new HashMap<String, String>();
	 	m1.put("A","Manish");
	 	m1.put("B","Soham");
	 	
	 	Map<String, String>m2=new HashMap<String, String>();
	 		m2.put("C", "Rudraksh");
	 		m2.put("D", "Sahdev");
	 		
	 		Map<Integer,Map<String, String>>map=new HashMap();
	 		map.put(101, m1);
	 		map.put(102, m2);
	 		
	 		System.out.println(map);//print all in a group
	 		
	 		System.out.println("=======By Using Iterator========");
	 		
	 		Set<Integer>mapkeys=map.keySet();
	 		Iterator<Integer>i1=mapkeys.iterator();
	 		while(i1.hasNext())
	 		{
	 			int mapk=i1.next();
	 			Map<String, String>vmap=map.get(mapk);
	 			Set<String>vmapkeys=vmap.keySet();
	 			Iterator<String>i2=vmapkeys.iterator();
	 			while(i2.hasNext()) {
	 				String skey=i2.next();
	 				String value=vmap.get(skey);
	 				System.out.println(value+" "+skey);
	 				//System.out.println(skey);
	 			}
	 		}
	 	System.out.println("=======By Using Lambda Exp=======");
	 	
	 	map.forEach((a,b)->{
	 		System.out.println(a);
	 		b.forEach((c,d)->System.out.println(c+" "+d));
	 	});
	}
}
