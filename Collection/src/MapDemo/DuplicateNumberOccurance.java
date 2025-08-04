package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberOccurance {

	public static void main(String[] args) {
	
		int[]arr= {2,5,4,2,5,6,1,3,6,4,3,8,7,9,8,4};
		
		Map<Integer, Integer>m=new HashMap<Integer, Integer>();
		
		for(int a:arr) {
			if(m.containsKey(a)) {
				int v=m.get(a);
				m.put(a, v+1);
			}
			else {
				m.put(a, 1);
			}
		}
		System.out.println("Duplicate Number        Occurance");
	
		m.forEach((k,v)->{
			if(v>1) {
				System.out.println(k+"                        "+v);
			}
		}
				
				);
}
}