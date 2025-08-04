package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IndiaMap {

	public static void main(String[] args) {
		
		Map<String, String>mh=new HashMap<>();
			mh.put("P", "Pune");
			mh.put("M", "Mumbai");
			
		Map<String,String>gd=new HashMap<>();
				gd.put("B","Baroda");
				gd.put("S","Surat");
				
		Map<Integer,Map<String, String>>map=new HashMap<>();
				map.put(1, mh);
				map.put(2, gd);
				
		Set<Integer>ind=map.keySet();
		Iterator<Integer>itr=ind.iterator();
			
		while(itr.hasNext()){
			int k=itr.next();
			Map<String, String>map2=map.get(k);
			Set<String>m2k=map2.keySet();
			Iterator<String>itr1=m2k.iterator();
			while(itr1.hasNext()){
				String s=itr1.next();
				String val=map2.get(s);
				System.out.println(s);
				System.out.println(val+" "+ s);
			}
		}				
	}
}
